package com.fbaa.example.readurl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class LogSearch {
	public static final String URL = "https://raw.githubusercontent.com/RockfordWei/langtest-resource/main/log0.txt";
	
	public static void main(String[] args) {
		LogParser parser = new LogParser(URL);
		List<Log> logs = parser.readURL();
		
		Map<String, List<Log>> map = logs.stream()
				.collect(Collectors.groupingBy(Log::getIp));
		
		Optional<Map.Entry<String, List<Log>>> resultMap = map.entrySet().stream()
				.reduce((e1, e2) -> e1.getValue().size() > e2.getValue().size()? e1 : e2);
		
//		Map<Object, Object> map2 = map.entrySet().stream()
//		        .collect(Collectors.toMap(
//		                e -> e.getKey(),
//		                e -> e.getValue().get(0)
//		            ));
//		
//		System.out.println(map2);
		
		String ip = resultMap.get().getKey();
		
		List<Log> result = resultMap.get().getValue();
		result.sort((a,b) -> (int)b.getDate().getTime() - (int)a.getDate().getTime());
		
		Date last = result.get(0).getDate();
		
		System.out.println(ip);
		System.out.println(last);
	}
	
}

class LogParser {
	public static final String SEPARATOR = " - - \\[";
	public static final String SEPARATOR_END = "\\]";
	
	private String url;
	
	public LogParser(String url) {
		this.url = url;
	}
	
	public List<Log> readURL() {
		List<Log> list = new ArrayList<>();
		try {
			URL urlCon = new URL(this.url);
			HttpURLConnection con = (HttpURLConnection)urlCon.openConnection();
			
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				Log log = this.parse(line);
				list.add(log);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Log parse(String line) throws ParseException {
		String [] tokens = line.split(SEPARATOR);
		String ip = tokens[0];
		String endLine = tokens[1];
		String [] tokensEnd = endLine.split(SEPARATOR_END);
		String date = tokensEnd[0];
		
		String pattern = "dd/MMMM/yyyy:HH:mm:ss XX";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Date dateFormat = sdf.parse(date);
		
		return new Log(ip, dateFormat);
	}
}

class Log implements Comparator<Log> {
	public String ip;
	public Date date;
	public Log(String ip, Date date) {
		this.ip = ip;
		this.date = date;
	}
	
	
	
	public String getIp() {
		return ip;
	}



	public void setIp(String ip) {
		this.ip = ip;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("{ip:%s, date: %s}", ip, date);
	}

	@Override
	public int compare(Log o1, Log o2) {
		return o1.getDate().compareTo(o2.getDate());
	}
}

package cgv.deagu.model;

import java.util.Date;

public class Movie {
	private int no;
	private String name; // 제목
	private String content; // 상세설명
	private String file; // 파일
	private String showTime; // 상영시간

	public Movie() {
	}

	public Movie(int no, String name, String content, String file, String showTime) {
		this.no = no;
		this.name = name;
		this.content = content;
		this.file = file;
		this.showTime = showTime;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	@Override
	public String toString() {
		return "Movie [no=" + no + ", name=" + name + ", content=" + content + ", file=" + file + ", showTime="
				+ showTime + "]";
	}

}

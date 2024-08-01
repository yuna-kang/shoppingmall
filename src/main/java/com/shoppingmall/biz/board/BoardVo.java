package com.shoppingmall.biz.board;

public class BoardVo {
	public class BoardVO {
		
		private String id;
		private int score;
		private String content;
		private int num;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		@Override
		public String toString() {
			return "BoardVO [id=" + id + ", score=" + score + ", content=" + content + ", num=" + num + "]";
		}

		
		
	}
}

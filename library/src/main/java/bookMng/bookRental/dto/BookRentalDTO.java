package bookMng.bookRental.dto;


public class BookRentalDTO {

    
	private int BookID; //도서ID
	private int UserID; //회원ID

	private String bookTitle; //도서명
	private String bookAuthor; //도서저자
	private int bookPrice; //도서가격

	private String userName; //사용자이름
	private String userSex;  //사용자성별
	private int userAge;     //사용자나이
	private String userPhone; //사용자 전화번호


	public int getBookID() {
		return BookID;
	}



	public void setBookID(int bookID) {
		BookID = bookID;
	}



	public int getUserID() {
		return UserID;
	}



	public void setUserID(int userID) {
		UserID = userID;
	}



	public String getBookTitle() {
		return bookTitle;
	}



	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}



	public String getBookAuthor() {
		return bookAuthor;
	}



	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getUserSex() {
		return userSex;
	}



	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}



	public int getUserAge() {
		return userAge;
	}



	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}



	public String getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	@Override
	public String toString() {
		return "BookRentalDTO [BookID=" + BookID + ", UserID=" + UserID + ", bookTitle=" + bookTitle + ", bookAuthor="
				+ bookAuthor + ", bookPrice=" + bookPrice + ", userName=" + userName + ", userSex=" + userSex
				+ ", userAge=" + userAge + ", userPhone=" + userPhone + "]";
	}
	

}

package pinme.getsetter;
//address class used to specify address for event and user
public class Address {
		private int id;
		private int houseNumber;
		private String street;
		private String city;
		private String state;
		private int zipcode;
		private String country;
		private double latitude;
		private double longitude;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public void setHouseNumber(int houseNumber) {
			this.houseNumber = houseNumber;
		}

		public int getHouseNumber() {
			return houseNumber;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getStreet() {
			return street;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCity() {
			return city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getstate() {
			return state;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCountry() {
			return country;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public double getLatitude() {
			return latitude;
		}

		public void setlongitude(double longitude) {
			this.longitude = longitude;
		}

		public double getLongitude() {
			return longitude;
		}

	}




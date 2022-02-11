package lovalaxmi999;

public class encbus {
	private long pasengers;
	private float ticketprice;
	private String busname;
	public long  getPasengers () {
	return pasengers;
	}
	public void setPasengers(long pasengers) {
		this.pasengers=pasengers;
	}
	public float getTicketprice(  ) {
		return ticketprice;
	}
	public void setTicketprice(float ticketprice) {
		this.ticketprice=ticketprice;
	}
	public String getBusname() {
		return busname;	
	}
	public void setBusname(String busname) {
		this.busname=busname;
	}
	public static void main(String args[]) {
		encbus s=new encbus();
		s.setPasengers(1050l);
		s.setTicketprice(132.09f);
		s.setBusname("abi bus");
		System.out.println(s.getPasengers());
		System.out.println(s.getTicketprice());
		System.out.println(s.getBusname());
		
		
		
	}
	
		}
	
	



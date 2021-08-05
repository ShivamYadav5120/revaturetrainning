package train;

public class TrainDemo {
			private int trainno;
			private String traincode;
			private String station;
			private String Arrival;
			private String Departure;
			
			public TrainDemo(int trainno, String traincode, String station, String arrival, String departure) {
				this.trainno = trainno;
				this.traincode = traincode;
				this.station = station;
				this.Arrival = arrival;
				this.Departure = departure;
			}
			public  void printStatement() {
				
				System.out.printf("%d %1s %17s %8s %11s\n", trainno,traincode,station,Arrival,Departure);

			}
	
			public static void main(String[] args) {
				System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
				System.out.println("-----------------------------------------------");
				System.out.println("# code    station           Arr.       Dep.");
				System.out.println("-----------------------------------------------");
				
				System.out.println();
				TrainDemo[] temp= {
						new TrainDemo(1,"YPR","Yasvantpur Jn  ","     ","23:40"),
						new TrainDemo(2,"GTL","Guntakal   Jn  ","03:45","03.50"),
						new TrainDemo(3,"SC ","Secundrabad  Jn","08:55","08.60"),
						new TrainDemo(4,"BPQ","Balharshah  Jn ","13:30","13.35"),
						new TrainDemo(5,"HBJ","Habibganj   Jn ","21:20","21.25"),
						new TrainDemo(6,"JHS","Jhansi       Jn","01.15","01.20"),
						new TrainDemo(7,"DEE","Delhi S Rohilla","07:20","     ")
						
				};
				for (TrainDemo obj  : temp )
				{
					obj.printStatement();
				}
				/*TrainDemo o1=new TrainDemo(1,"YPR","Yasvantpur Jn","  ","23:40");
				o1.printStatement();
                TrainDemo o2=new TrainDemo(2,"GTL","Guntakal Jn","03:45","03.50");
                o2.printStatement();
				TrainDemo o3=new TrainDemo(3,"SC","Secundrabad Jn","08:55","08.60");
				o3.printStatement();
				TrainDemo o4=new TrainDemo(4,"BPQ","Balharshah Jn","13:30","13.35");
				o4.printStatement();
				TrainDemo o5=new TrainDemo(5,"HBJ","Habibganj Jn","21:20","21.25");
				o5.printStatement();
				TrainDemo o6=new TrainDemo(6,"JHS","Jhansi Jn","01.15","01.20");
				o6.printStatement();
				TrainDemo o7=new TrainDemo(7,"DEE","Delhi S Rohilla","07:20","  ");
				o7.printStatement();*/

						
				}
			}
		
	
				
			



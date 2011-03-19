package szlab4_whitespaces;

public class Fix1 extends ASource
{

	public Fix1(int ID)
        {
            System.out.println("FIX1 | Fix1()| Fix1 konstruktor");
            value = 1;
            output = new PinOut();
            this.ID = ID;
	}
        public int GetID()
        {
            System.out.printf("Fix1 |GetID() | CALL\n");

            return this.ID;
        }

        public void SetValue()
        {        //jópofa h van ilyenje :D
//		value = 1;
             System.out.printf("Fix1 | SetValue() | CALL\n");
	}
         public void Delete(){
        };
	
}
package szlab4_whitespaces;

public class Fix0 extends ASource
{

	public Fix0(int ID)
        {
            System.out.println("FIX0 | Fix0()| Fix0 konstruktor");
            value = 0;
            output = new PinOut();
            this.ID = ID;
	}
        public int GetID()
        {
            System.out.printf("Fix0 |GetID() | CALL\n");

            return this.ID;
        }
        public void SetValue()
        {        //jópofa h van ilyenje :D
//		value = 0;
             System.out.printf("Fix0 | SetValue() | CALL\n");
	}
        public void Delete(){
        };
}
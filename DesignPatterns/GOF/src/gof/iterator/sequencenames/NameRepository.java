/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof.iterator.sequencenames;

/**
 *
 * @author FA20-BSE-037
 */
public class NameRepository implements Container {
   
   //public String names[] = {"Robert" , "Johnson" ,"Julie" , "Lisa", "Starc"};
//    public Object students [][] = {{"Ali", 19, "Fa20-bse-001", 3.3},
//        {"Wali", 18, "Fa20-bse-010", 3.2},
//        {"khalid", 21, "Fa20-bse-011", 2.3},
//        {"Wajid", 17, "Fa20-bse-018", 3.0}
//        
//    };
    private Student[] students;

    public NameRepository(Student[] students) {
        this.students = students;
    }

    NameRepository(Object[][] studentss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < students.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return students[index++];
         }
         return null;
      }		
   }
}
    

public class BukuTester {
   public static void main(String[] args) {
      Buku skibidi = new Buku("Skibidi", 177013.00, "Ligma", 2024.00);
      Buku juki = new Buku("JukiSigma", 24414, "JukiHoki", 1945);
      Buku nemoto = new Buku("nemoto", 3, "Aqua", 2021);
      Buku ligma = new Buku("Ligma", 200120, "Sapwan", 2024);
      Buku mewing = new Buku("Mewing", 212234, "Sapwan", 2024);


      System.out.print("buku :"); { 

      System.out.println(skibidi.judul);
      System.out.println(skibidi.id);
      System.out.println(skibidi.pengarang);
      System.out.println(skibidi.tahunterbit); };

      System.out.print("buku 2:");

      System.out.println(juki.judul);
      System.out.println(juki.id);
      System.out.println(juki.pengarang);
      System.out.println(juki.tahunterbit);

      System.out.print("buku 3:");

      System.out.println(nemoto.judul);
      System.out.println(nemoto.id);
      System.out.println(nemoto.pengarang);
      System.out.println(nemoto.tahunterbit);

      System.out.print("buku 4:");

      System.out.println(ligma.judul);
      System.out.println(ligma.id);
      System.out.println(ligma.pengarang);
      System.out.println(ligma.tahunterbit);

      System.out.print("buku 5:");
      
      System.out.println(mewing.judul);
      System.out.println(mewing.id);
      System.out.println(mewing.pengarang);
      System.out.println(mewing.tahunterbit);
   }
}
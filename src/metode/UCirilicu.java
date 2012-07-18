package metode;
/**
 *
 * @author ALATKA
 */


public class UCirilicu {
    
    public String metoda (String tekst){

        //KONVERTOVANJE VELIKIH SLOVA
            tekst = tekst.replace('A', 'А');
            tekst = tekst.replace('B', 'Б');
            tekst = tekst.replace('V', 'В');
            tekst = tekst.replace('G', 'Г');
            
            tekst = tekst.replace("Dj", "Ђ");
            tekst = tekst.replace("DJ", "Ђ");
            tekst = tekst.replace('Đ', 'Ђ');
            // E SE NE RAZLIKUJE
            
            
            tekst = tekst.replace('I', 'И');
            // J SE NE RAZLIKUJE
            // K SE NE RAZLIKUJE
            
            tekst = tekst.replace("Lj", "Љ");
            tekst = tekst.replace("LJ", "Љ");
            // M SE NE RAZLIKUJE
            
            tekst = tekst.replace("Nj", "Њ");
            tekst = tekst.replace("NJ", "Њ");
            // O SE NE RAZLIKUJE
            tekst = tekst.replace('P', 'П');
            tekst = tekst.replace('R', 'Р');
            tekst = tekst.replace('S', 'С');
            // T SE NE RAZLIKUJE
            tekst = tekst.replace('Ć', 'Ћ');
            tekst = tekst.replace('U', 'У');
            tekst = tekst.replace('F', 'Ф');
            tekst = tekst.replace('H', 'Х');
            tekst = tekst.replace('C', 'Ц');
            tekst = tekst.replace('Č', 'Ч');
            tekst = tekst.replace("DŽ", "Џ");
            tekst = tekst.replace("Dž", "Џ");
            tekst = tekst.replace("DZ", "Џ");
            tekst = tekst.replace("Dz", "Џ");
            tekst = tekst.replace('Š', 'Ш');
            
            tekst = tekst.replace('N', 'Н');
            tekst = tekst.replace('L', 'Л');
            tekst = tekst.replace('Z', 'З');
            tekst = tekst.replace('D', 'Д');
            tekst = tekst.replace('Ž', 'Ж');
            
            
       // KONVERTOVANJE MALIH SLOVA
            tekst = tekst.replace('a', 'a');
            tekst = tekst.replace('b', 'б');
            tekst = tekst.replace('v', 'в');
            tekst = tekst.replace('g', 'г');
            
            tekst = tekst.replace("dj", "ђ");
            tekst = tekst.replace('đ', 'ђ');
            // e SE NE RAZLIKUJE
            
            tekst = tekst.replace('i', 'и');
            // j SE NE RAZLIKUJE
            tekst = tekst.replace('k', 'к');
            
            tekst = tekst.replace("lj", "љ");
            tekst = tekst.replace('l', 'л');
            
            tekst = tekst.replace('m', 'м');
            
            tekst = tekst.replace("nj", "њ");
            // o SE NE RAZLIKUJE
            tekst = tekst.replace('p', 'п');
            tekst = tekst.replace('r', 'р');
            tekst = tekst.replace('s', 'с');
            tekst = tekst.replace('t', 'т');
            tekst = tekst.replace('ć', 'ћ');
            tekst = tekst.replace('u', 'у');
            tekst = tekst.replace('f', 'ф');
            tekst = tekst.replace('h', 'х');
            tekst = tekst.replace('c', 'ц');
            tekst = tekst.replace('č', 'ч');
            tekst = tekst.replace("dz", "џ");
            tekst = tekst.replace("dž", "џ");
            tekst = tekst.replace('š', 'ш');
           
            
            tekst = tekst.replace('ž', 'ж');
            tekst = tekst.replace('z', 'з');
            tekst = tekst.replace('n', 'н');
            tekst = tekst.replace('d', 'д');
            tekst = tekst.replace('l', 'л');
            
            return tekst;
    }         
}
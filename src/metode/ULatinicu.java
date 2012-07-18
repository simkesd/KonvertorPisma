package metode;

/**
 *
 * @author ALATKA
 */


public class ULatinicu {
    
    public String metoda(String tekst){

        //KONVERTOVANJE VELIKIH SLOVA
            // A SE NE RAZLIKUJE
            tekst = tekst.replace('Б', 'B');
            tekst = tekst.replace('В', 'V');
            tekst = tekst.replace('Г', 'G');
            tekst = tekst.replace('Д', 'D');
            tekst = tekst.replace("Ђ", "Đ");
            // E SE NE RAZLIKUJE
            tekst = tekst.replace('Ж', 'Ž');
            tekst = tekst.replace('З', 'Z');
            tekst = tekst.replace('И', 'I');
            // J SE NE RAZLIKUJE
            // K SE NE RAZLIKUJE
            tekst = tekst.replace('Л', 'L');
            tekst = tekst.replace("Љ", "Lj");
            // M SE NE RAZLIKUJE
            tekst = tekst.replace('Н', 'N');
            tekst = tekst.replace("Њ", "Nj");
            // O SE NE RAZLIKUJE
            tekst = tekst.replace('П', 'P');
            tekst = tekst.replace('Р', 'R');
            tekst = tekst.replace('С', 'S');
            // T SE NE RAZLIKUJE
            tekst = tekst.replace('Ћ', 'Ć');
            tekst = tekst.replace('У', 'U');
            tekst = tekst.replace('Ф', 'F');
            tekst = tekst.replace('Х', 'H');
            tekst = tekst.replace('Ц', 'C');
            tekst = tekst.replace("Ч", "Č");
            tekst = tekst.replace("Џ", "Dž");
            tekst = tekst.replace('Ш', 'Š');
            
            // KONVERTOVANJE MALIH SLOVA
            // a SE NE RAZLIKUJE
            tekst = tekst.replace('б', 'b');
            tekst = tekst.replace('в', 'v');
            tekst = tekst.replace('г', 'g');
            tekst = tekst.replace('д', 'd');
            tekst = tekst.replace("ђ", "đ");
            // e SE NE RAZLIKUJE
            tekst = tekst.replace('ж', 'ž');
            tekst = tekst.replace('з', 'z');
            tekst = tekst.replace('и', 'i');
            // j SE NE RAZLIKUJE
            tekst = tekst.replace('к', 'k');
            tekst = tekst.replace('л', 'l');
            tekst = tekst.replace("љ", "lj");
            tekst = tekst.replace('м', 'm');
            tekst = tekst.replace('н', 'n');
            tekst = tekst.replace("њ", "nj");
            // o SE NE RAZLIKUJE
            tekst = tekst.replace('п', 'p');
            tekst = tekst.replace('р', 'r');
            tekst = tekst.replace('с', 's');
            tekst = tekst.replace('т', 't');
            tekst = tekst.replace('ћ', 'ć');
            tekst = tekst.replace('у', 'u');
            tekst = tekst.replace('ф', 'f');
            tekst = tekst.replace('х', 'h');
            tekst = tekst.replace('ц', 'c');
            tekst = tekst.replace('ч', 'č');
            tekst = tekst.replace("џ", "dž");
            tekst = tekst.replace('ш', 'š');
            
            return tekst;
    }
}

public class ex_31_1 {
    public class DnaToRna {

        public static String dnaToRna(String dna) {
            if (dna.isEmpty()) {
                return "";
            }

            StringBuilder rna = new StringBuilder();
            for (int i = 0; i < dna.length(); i++) {
                char nucleotide = dna.charAt(i);
                switch (nucleotide) {
                    case 'G':
                        rna.append('C');
                        break;
                    case 'C':
                        rna.append('G');
                        break;
                    case 'T':
                        rna.append('A');
                        break;
                    case 'A':
                        rna.append('U');
                        break;
                    default:
                        return null; // если встречается некорректный символ
                }
            }

            return rna.toString();
        }
    }
}

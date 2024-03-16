package pemlanpakjoko;


    public class mahasiswa {
        String namas;
        String nims;
        String alamats;
    
        public mahasiswa(String namas, String nims, String alamats){
            this.namas = namas;
            this.nims = nims;
            this.alamats = alamats;
        }
    
        public String getnamas(){
            return namas;
        }
    
        public String getnims(){
            return nims;
        }
    
        public String getalamats(){
            return alamats;
        }
        
    }


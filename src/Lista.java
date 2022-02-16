public class Lista {
    //ovo je prvi cvor u listi - head
    Node head;


    public void addFirst(int data) {
        if(isEmpty()) {
            //Dodajemo novi cvor
            Node node = new Node(data);
            //pridajemo mu vrednost koju je korisnik uneo.
            node.setData(data);
            //za svaki slucaj stavljamo vrednost null referenci na sledeci cvor
            node.setNext(null);
        } else {
            System.out.printf("Ne mozete uneti %d, lista nije prazna%n", data);
            System.out.println("--------------------------------------------------------------");
        }
    }

    public void insert(int data) {
        //Dodajemo novi cvor
        Node node = new Node(data);
        //pridajemo mu vrednost koju je korisnik uneo.
        node.setData(data);
        //za svaki slucaj stavljamo vrednost null referenci na sledeci cvor
        node.setNext(null);
        if (head == null) {
            //pitamo se da li je lista prazna, ako jeste - novonastali node
            // postaje head (prvi cvor u listi)
            head = node;
        } else {
            //privremena promenljiva postaje head
            Node temp = head;
            //privremena promenljiva "vrti" cvorove dok ne stigne do onog kojem
            //je referenca null
            while (temp.getNext() != null) {
                //BITNOO - PRIVREMENA PROMENLJIVA POSTAJE SLEDECI CVOR DA
                //BI SE "LISTA" VRTELA DO KRAJA
                temp = temp.getNext();
            }
            //privremena promenljiva pridaje poslednjem cvoru koji trenutno ima
            // referencu null (kraj) referencu ka novododatom cvoru u 9 redu.
            // (a kojem je vrednost dodata u 11 redu.
            temp.setNext(node);

        }
    }
    public void insertAtStart(int data){
        //ubacujemo novi cvor
        Node node = new Node(data);
        //stavljamo mu referencu na next polje da bude dosadasnji head
        node.setNext(head);
        //head-u pridajemo vrednos novog cvora
        head = node;
    }


    public void insertLast(int data) {
        //proveravamo da li je lista prazna.
        if(isEmpty()){
            //ako jeste, ubacujemo node metodom insert sa data vrednoscu int data koju je korisnik uneo.
            addFirst(data);
        } else {
        //ako nije prazna, pravimo novi cvor sa vrednoscu data, ali je jos ne ubacujemo u listu, vec
        //samo pridajemo null vrdnos next polju.
        Node node = new Node(data);
        node.setNext(null);

        //pravimo PRIVREMENU instancu temp koja nam sluzi za PROLAZAK kroz LISTU (ovo bi mozda moglo kao zasebni metod?)
        Node temp = head;
        while (temp.getNext() != null) { // Dok privremenoj instanci next nije null, znaci da ima jos clanova liste (hasNext)
            //dok ih ima, temp dobija svaku sledecu .next vrednost
            temp = temp.getNext();
        }
        //kad izadjemo iz petlje, a to se desava kada vrednost polja next bude null, privremena (poslednja) instanca
        // dobija referencu ka cvoru koji smo napravili pomocu korisnickog unosa.
        temp.setNext(node);
    }

}

    //metoda koja proverava da li je lista prazna. Lissta je prazna ako head nema referencu(nije instanciran).
    public boolean isEmpty() {

        return head == null;
    }


        //metoda koja stampa celu listu
    public void show(){
        //cvor privremeno dobija vrednost head
        Node temp = head;

        System.out.println("Lista:");

        //prolazimo kroz listu dok ne dodjemo doreference na null
        while (temp.getNext() != null){
            //stampamo trenutnog clana
            System.out.println(temp.getData());
            //privremeni cvor postaje sleddeci u nizu.
            temp = temp.getNext();
        }
        //Izasli smo iz liste, ali nije odstampan poslednji zato sto je njegov .next bio null. Stampamo ga izdvojeno.
        System.out.println(temp.getData());
        System.out.println("----------------------------Kraj liste----------------------------------");
    }


}

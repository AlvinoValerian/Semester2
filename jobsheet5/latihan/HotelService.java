package latihan;

public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int rooms;

    void tambah(Hotel h){
        if (rooms<listHotel.length){
            listHotel[rooms] = h;
            rooms++;
        }else{
            System.out.println("Hotel Sudah Penuh!!");
        }
    }

    void tampil(){
        for(Hotel h:listHotel){
            h.tampil();
            System.out.println("--------------------");
        }    
    }

    void hargaBubbleShort(){
        for(int i=0 ;i<listHotel.length;i++){
            for(int j=1;j<listHotel.length-i;j++){
                if(listHotel[j].harga < listHotel[j-1].harga){
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void bintangSelectionShort(){
        for(int i=0;i<listHotel.length;i++){
            int indxMin = i;
            for(int j = i+1;j<listHotel.length;j++){
                if(listHotel[j].bintang > listHotel[indxMin].bintang){
                    indxMin = j;
                }
            }
            // swap
            Hotel tmp = listHotel[indxMin];
            listHotel[indxMin] = listHotel[i];
            listHotel[i] = tmp;

        }
    }
}

    
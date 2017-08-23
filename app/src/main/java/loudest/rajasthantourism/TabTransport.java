package loudest.rajasthantourism;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;


public class TabTransport extends Fragment{
    public static final String TAG = "TabTransport";
    public TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_transport, container, false);
        tv = (TextView)view.findViewById(R.id.textView4);

        tv.setText("Taxis: available for hire at Airports and from the Hotels\n" +
                "Chartered Taxis: available in cities & towns; may be rented for movement in the State\n" +
                "Taxis ranging from small, midsize to utility vehicles; station wagons and luxury cars are also available. Cars can also be rented with or without drivers.\n" +
                "It is even possible to hire a motorcycle. \n" +
                "Rajasthan State Transport Buses: cover most parts of the State; depots in the Districts. For more details visit: www.rsrtc.gov.in\n" +
                "Private Buses: Quite a lot of towns, cities and tourist places are covered by buses run by private operators. Short tour packages are also available.\n" +
                "Local transport: short distances can be travelled in taxi / engine driven three wheelers\n" +
                "Boats: available at sites at river banks or sea coasts (both manual and engine)\n" +
                "Train Linkages: all states are connected with train, particularly Delhi & Mumbai-www.indianrail.gov.in \n" +
                "Tourist Trains: ‘Palace on Wheels’ , ‘Royal Rajasthan on Wheels’\n" +
                "Jaipur is an international airport in Rajasthan\n" +
                "Tourism on Indian Railways: \n" +
                "\n" +
                "‘Palace on Wheels’\n" +
                "\n" +
                "&\n" +
                "\n" +
                "‘Royal Rajasthan on Wheels’\n" +
                "\n" +
                "(Rajasthan-MP-UP-Delhi)\n" +
                "\n" +
                "Palace on Wheels (POW) is a rare train travel facility with Royal luxury. It is run by the Indian Railways and the Rajasthan Tourism Development Corporation since three decades. Main features are as follows:\n" +
                "\n" +
                "It has 14 carriages which can accommodate 100+ passengers\n" +
                "Two attached dining cars offer Indian and Continental dishes\n" +
                "There is a spacious bar lounge\n" +
                "Every cabin has attached bath, wardrobe, cosy reading lights\n" +
                "Majestic lounges to socialize with fellow travelers\n" +
                "DVD/ CD player as well as piped music\n" +
                "Gymnasium and spa\n" +
                "Medical attention on call\n" +
                "Many other customized services with personal touch & care\n" +
                "Schedule: Every Wednesday at 1600 hrs from Safdarjung Railway Station, New Delhi  \n" +
                "\n" +
                "Travel Duration: 7 Nights (8 Days)\n" +
                "\n" +
                "Places Covered: New Delhi > Jaipur > Sawai Madhopur > Chittorgarh > Udaipur > Jaisalmer > Jodhpur > Bharatpur > Agra > New Delhi\n" +
                "\n" +
                "Tarriff: Deluxe Saloon – Around 520 to 770 USD per person per night during peak season and 390 - 575 USD during the lean season\n" +
                "\n" +
                "‘Royal Rajasthan on Wheels’ (RRW)\n" +
                "\n" +
                "Palace on Wheels has been running successfully for more than 25 years. To enhance this experience, a new tourist train known as the ‘Royal Rajasthan on Wheels’ has been started with added features, facilities and services.\n" +
                "\n" +
                "Its route is Delhi>Udaipur>Chittaurgarh>Sawai Madhopur>Jaipur>Khajuraho>Varanasi>Agra.\n" +
                "\n" +
                "For more information and booking\n" +
                "\n" +
                "Visit: www.rtdc.in\n" +
                "\n" +
                "Facilitation:\n" +
                "\n" +
                "Department of Tourism, Government of Rajasthan is the main Tourism Promotion & Facilitation Agency of the Government.  \n" +
                "In addition, there is Rajasthan Tourism Development Corporation (RTDC ) which has its local tourism offices/hotels at various places in the State and even outside\n" +
                "They do help in giving information, getting bookings in hotels, organizing tour packages and tying up with transport agencies.\n" +
                "RTDC’s toll free number is: 1800-103-3500 (within India)\n" +
                "Assistant Director, Tourist Reception Centre, Jaipur, 0141-5110598\n" +
                "Chief Reservation Office RTDC, New Delhi, 011-23381884/23386069\n" +
                "Chief Reservation Office RTDC, Jaipur, 0141-5115512/5114768\n" +
                "Transport Unit RTDC, Jaipur, 0141-2375466 \n" +
                "Useful links for more information:\n" +
                "\n" +
                "www.rajasthantourism.gov.in\n" +
                "\n" +
                "www. http://rtdc.in/\n" +
                "\n" +
                "www.incredibleindia.com\n" +
                "\n" +
                "www.indiatourism.com \n\n\n\n\n\n\n\n");
        return view;
    }
}


package loudest.rajasthantourism;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TabWeather extends Fragment {
    public static final String TAG = "TabWeather";
    public TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_weather, container, false);
        tv = (TextView)view.findViewById(R.id.textView2);

        tv.setText("Rajasthan, like India, has a diversified weather. However, it is characterized by hot, windy and sandy weather most of the year. However, in the winters the temperatures may go upto freezing point at some places, for example at Mount Abu. \n" +
                "\n" +
                "October - January is the best season to visit Rajasthan.\n" +
                "\n" +
                "General Distribution of Weather:\n" +
                "\n" +
                " 1. January to March (Autumn)\n" +
                "\n" +
                " Temperature: 50F - 80F (100 C - 270 C)\n" +
                "\n" +
                "  Rainfall: 4 MM – 7 MM\n" +
                "\n" +
                "2. April to June (Summer)\n" +
                "\n" +
                " Temperature: 75F - 105F (240 C - 450 C)\n" +
                "\n" +
                " Rainfall: 11 MM – 30 MM\n" +
                "\n" +
                "3. July to September (Monsoon)\n" +
                "\n" +
                " Temperature: 70F - 95F (210 C - 350 C)\n" +
                "\n" +
                " Rainfall: 100 MM – 165 MM\n" +
                "\n" +
                "4. October to December (Winter)\n" +
                "\n" +
                " Temperature: 55F - 85F (130 C - 300 C)\n" +
                "\n" +
                " Rainfall: 3 MM – 8 MM\n" +
                "\n" +
                "\n" +
                "\n" +
                "Important to Note:\n" +
                "\n" +
                "It’s a low rainfall area. Monsoon is generally humid but quite often windy and refreshing.  \n" +
                "Sometimes, floods do occur in different parts of the State including at the destinations listed here; \n" +
                "Summers in the month of May & June are quite hot: the day time temperature ranging between 40-46 °C and night temperature between 20 °C to 29 °C; \n" +
                "Winters (October to February) are generally pleasant and dry with clear days;  \n" +
                "January is the coldest month. The minimum temperature sometimes falls to -2 °C\n\n\n\n");
        return view;
    }
}
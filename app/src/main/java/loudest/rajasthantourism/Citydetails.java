package loudest.rajasthantourism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Citydetails extends AppCompatActivity {

    public TextView tv_citydetails;
    int pressedButtonNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citydetails);

        tv_citydetails = (TextView) findViewById(R.id.tv_detail);

        pressedButtonNumber = getIntent().getExtras().getInt("buttonNumber");
        switch(pressedButtonNumber){
            case 1:
                tv_citydetails.setText("Jaipur\n\n"+
                        "Jaipur, the capital of vibrant Rajasthan, is a popular tourist destination. The city is home to numerous architectural marvels like the majestic City Palace, the splendid Jantar Mantar, the glorious Hawa Mahal and the Amer Fort, Jaigarh Fort and Nahargarh Fort. \n" +
                        "\n" +
                        "Jaipur, which is located in eastern Rajasthan, is a land of colourful festivals like Teej and Gangaur. Spread over an area of 11,117.8 square kilometres, the city is situated at a height of 430 meters. The temperature soars up to 45 degrees during summers and plummets to almost two degrees during the winter season. Ban Ganga and Sabi rivers flow through its historic terrain. The Ramgarh Dam, built upon the Ban Ganga, is a major source of drinking water. It also houses the Sambhar Lake, which is famed for its salt. English, Rajasthani and Hindi are the common dialects of Jaipur.\n" +
                        "\n" +
                        "Foundation and Construction \n" +
                        "\n" +
                        "Maharaja Sawai Jai Singh II, who gave the city its name, laid the foundation stone of the 'Pink City' in the year 1728. The layout of the city was planned by Vidyadhar Bhattacharya, a descendant of the Shaspati lineage. Shilpa Shastra and the Pithapada form the keystone of his vision. Jaipur has been built in alignment with rules of the grid method of construction. Nine rectangular-shaped chokris or city spheres laid out in broad, spruced up roads comprise the avant-garde architectural framework of Jaipur. Bolstered by munitions to ward off any foreign attack, Jaipur in its entire pink splendour is a fascinating spectacle to behold.\n" +
                        "\n" +
                        "Interesting legends surround the birth of Jaipur. It is said that Raja Sawai Jai Singh II conceptualised the creation of Jaipur led by reasons like the growing head count, the paucity of water resources and the gradual demise of the Mughal aura. The charismatic ruler's sound understanding of engineering science is reflected in every nook and corner of Jaipur.\n" +
                        "\n" +
                        "Places to See\n" +
                        "\n" +
                        "The maharaja is also credited with the construction of the amazing Jantar Mantar or the famous observatory. It was built between 1728 and 1734. An interesting piece of information for quiz buffs is that the incredibly talented Raja is said to have contrived a mechanism for watering the sprawling acres of Amber Fort, at the tender age of thirteen.\n" +
                        "\n" +
                        "The City Palace of Jaipur forms the cynosure of attraction, both literally and metaphorically. It comprises the Olympian palace, the Jantar Mantar and the Janana Mahals or the dwelling of the Maharanis'. A fervent devotee of Lord Krishna, the King re-established the idol of the blue-hued God, at Jaipur in the year 1719.\n" +
                        "\n" +
                        "A real connoisseur of art and culture, Maharaja Sawai Jai Singh's court witnessed an unprecedented spurt of activities in the cultural sphere. Distinguished intellectuals made a beeline for the esteemed Raja's durbar.\n" +
                        "\n" +
                        "Strewn with remnants of yesteryears, Jaipur houses some of the exquisite tourist highlights. Some of the must-see destinations of the Pink City are:\n" +
                        "\n" +
                        "City Palace\n" +
                        "Hawa Mahal\n" +
                        "Amer Fort\n" +
                        "Nahargarh Fort\n" +
                        "Sargasuli\n" +
                        "Govind Devji Temple\n" +
                        "Niwas Bagh\n" +
                        "Vidyadharji Ka Bagh\n" +
                        "Sisodia Rani Ka Bagh\n" +
                        "Jaigarh Fort\n" +
                        "Moti Doongri\n" +
                        "Jal Mahal\n" +
                        "\n" +
                        "How to Reach?\n" +
                        "\n" +
                        "Travelling by air is the most convenient way to reach Jaipur. The Jaipur Airport in Sanganer is about 12 kilometres away from the main city. Both domestic and international flights connect it to other cities across the globe. The city is also easily reachable from other cities via railways. Rajasthan State Road Transport Corporation (RSRTC) regularly plies Volvo and deluxe buses between Jaipur and other cities. \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Jaipur Facts\n" +
                        "\n" +
                        "City Name\tJaipur\n" +
                        "State\tRajasthan\n" +
                        "District\tJaipur\n" +
                        "District Headquarters\tJaipur\n" +
                        "Tehsil/Taluk\tJaipur\n" +
                        "Ward\t77\n" +
                        "Zone\tMoti Dungri Zone, Hawa Mahal East, Hawa Mahal West, Vidyadhar Nagar, Civil Line, Sanganer, Amber, Mansarovar\n" +
                        "Lat Long\t26.908787, 75.781631\n" +
                        "Area\t43.17 sq miles (111.8 km2)\n" +
                        "Population as per 2011\t3,073,350\n" +
                        "Official Languages\tHindi\n" +
                        "Time zone\tIST (UTC+5:30)\n" +
                        "STD Code\t0141\n" +
                        "Transport\tAir, Road, Rail, Metro\n" +
                        "Vehicle registration\tRJ-14 (Jaipur), RJ-45 (Jaipur North)\n" +
                        "Food and Cuisine\tDal, Baati, Lashun-Ki-Chutney, Mirchi-Bada, Gatte-Ki-Sabji, Bajre Ki Roti, Kadhi, Churma, Gujia, Halwa, Imarti, Ghevar etc.\n" +
                        "Religion\tHindus, Muslim, Jains\n" +
                        "Festival\tCamel Festival, Beneshwar Fair, Nagaur Fair, Desert Festival, Elephant Festival, Mewar Festival, Gogaji Fair, Kaliteej, Ramdevra Fair, Marwar Festival, Dusshera, Pushkar Fair, Kolyat Fair, Gangaur Fair, Kaila Devi Fair, Mahavir Ji Fair, Summer Festival Mt.Abu (June), Teej Festival, Kite Festival, Baneshwar Fair, Mewar Festival etc.\n" +
                        "Monuments\tAmber Fort, City Palace, Gaitore, Jal Mahal, Rambagh Palace, Albert Hall Museum, Hawa Mahal, Jaigarh Fort, Jantar Mantar, Nahargarh Fort, Statue Circle etc.\n" +
                        "Places of interest\tHawa Mahal, Amber Fort, Jantar Mantar, Jal Mahal, Jaigarh Fort, Albert Hall Museum, City Palace, Nahargarh Fort, Birla Mandir, Govind Devji Temple, Raj Mandir Cinema, Rambagh Palace - Taj Hotels, Jaipur Zoo, Sawai Mansingh Stadium etc.\n" +
                        "Markets\tJohari Bazaar, Kishanpole Bazaar, Chaura Rasta, Tripolia Bazaar, Chandpole Bazaar, Chameliwala Market - Gems, Bapu Bazaar, Nehru Bazaar, Jauhari Bazar (Jeweller's Market), Choti Choppad, Badi Choppad, Indira Bazaar etc.\n" +
                        "Hospital\tJaipur Hospital, Santokba Durlabhji Memorial Hospital, Monilek Hospital, Jaipur Hospital, Fortis Hospital, Apex Hospital Pvt. Ltd., Imperial Hospital, Aanchal Fertility and Mother Care Hospital, Bhagwan Mahaveer Cancer Hospital and Research Centre etc.\n" +
                        "Hotel\tRaj Palace, Mansingh Hotel, Hotel Jaipur Palace, Hotel Sarang Palace, Umaid Mahal, Hotel Silver Plaza, ITC Rajputana, Hotel Umaid Bhawan, Hotel Jaipur City, Rambagh Palace, Radisson Blu Hotel, Arya Niwas Hotels, Sheraton Hotel, Jaipur Marriott Hotel, The Oberoi Rajvilas, Nana-Ki-Haveli, Shahpura Hotels Jaipur, Trident Jaipur, Jaipur Hotels, Hotel Kalyan, Amer City Heritage Hotel etc.\n" +
                        "Industries\tJaipur Stock Exchange, Anand Industries, Tarun Industries, Rajasthan Electric Industries, Shree Vishwakarma Industries, Jaipuria Group of Industries Private Limited, Jaipur Industrial Services, Jaipur Time Industries, Summer Internship Training, Software Industrial Project Work, Jaipur Textile Industries, Aditya Autolamp India Pvt Ltd, Netescape Technologies Pvt Ltd, CMC Limited, Next Step Web Solution etc.\n" +
                        "University/College\tUniversity of Rajasthan, Manipal University Jaipur, National Institute of Ayurveda, Indian Institute of Health Management Research, The LNM Institute of Information Technology Jaipur and Malviya National Institute of Technology, Subodh College, Rajasthan Technical University (RTU), Swami Keshvanand Institute of Technology (SKIT), JECRC, Poornima College of Engineering, Gyan Vihar College etc.\n" +
                        "Notable people\tRajeev Khandelwal - Actor and TV Presenter, Model, Irrfan Khan - Actor, Ila Arun - Singer, Asrani - Actor, Rajeev Khandelwal - Actor, TV presenter, Model, Diya Kumari - Politician, Saawan Kumar Tak - Director, Screenwriter, Producer, Lyricist etc.");
                break;
            case 2:
                tv_citydetails.setText("Udaipur\n\n" +
                        "Udaipur, popularly called the 'city of Lakes' and the' Venice of the east 'is located in Southern Rajasthan , close to Gujarat. The city spread over 37 square kilometers is located between 24°35'North and 73°41' East and has a average elevation of 598 meters. The temperature in Udaipur ranges from 38° C to 28.8°C in summer and from 28.3° C to 11.6°C in winter. The Ahar River, a tributary of the Berach River flows in the north east of the city.\n" +
                        "\n" +
                        "The city, a top tourist spot of Rajasthan, is the sixth largest in Rajasthan, as well as the headquarters of the Udaipur district.\n" +
                        "\n" +
                        "The city is very well connected by road and rail. Udaipur is connected by NH 76 to Chittorgarh and by NH8 to Ahmadabad and Rajasmand in Gujarat. Both the highways cut across the city. As NH 8 is part of the golden Quadrilateral connecting Delhi and Mumbai, Udaipur falls midway on its route and is equidistance from each metro. Most of the urban development is on this part of the city, near the highways, as this north east part of the city has few lakes and more of plain area. Some of the residential colonies are Shabri Colony, Mahavir Colony, and Ashok Nagar. \n" +
                        "\n" +
                        "Udaipur falls on the North Western Line of the Indian Railways and is under the jurisdiction of its Ajmer division. The rail line has now been converted to broad gauge and offers connections to Delhi, and Jaipur, the capital of the state. The city has two railway stations The Udaipur city railway station and the Udaipur railway station. \n" +
                        "\n" +
                        "Udaipur is famed for its numerous man-made lakes, landscaped gardens, and Rajput palaces, many of which are now converted into luxury hotels. It gets a number of foreign and domestic tourists for its culture and the royal ambience. The city is dotted with old havelis and temples. Some of the hotels in the city are Anand Bhawan, Taj Lake Palace, Monalisa, Chandra Prakash, Shalimar, and Keerti.\n" +
                        "\n" +
                        "Landmarks of Udaipur\n" +
                        "\n" +
                        "Pichola Lake is an artificial lake with islands located within it. The lake was created in the 13th century.\n" +
                        "Lake Palace is a palace now converted into a heritage hotel, lying in Pichola Lake.\n" +
                        "Jagmandir is an island palace within the Pichola Lake.\n" +
                        "Fateh Sagar Lake is an artificial lake constructed by the Maharana Fateh Singh. It lies in the north of the Pichola Lake.\n" +
                        "Maharana memorial is a park in the north of the city. It has a bronze statue of Maharana Pratap.\n" +
                        "Saheliyon -Ki-Bari is a beautiful garden landscaped with fountains and water channels, in the northern part of the city.\n" +
                        "Amba mata mandir\n" +
                        "Ganeshji mandir\n" +
                        "Halon Ki masjid\n" +
                        "Kumharon ka bhatta\n" +
                        "Sukhadia circle a round- about in the north of the city is a well known landmark.\n" +
                        "Ahar Museum in the east of the city contains over nineteen cenotaphs of Maharajas of Mewar. It displays sculptures and archeological finds.\n" +
                        "Sundarwas\n" +
                        "Library\n" +
                        "Some of the educational institutes in the city are\n" +
                        "Maharana Sanskrit College\n" +
                        "Meera Girls College\n" +
                        "Maharana Bhopal College\n" +
                        "Polytechnic\n" +
                        "Sukhadia University");
                break;
            case 3:
                tv_citydetails.setText("Ajmer\n\n"+
                        "In this era of communalism and religious intolerance, Ajmer comes across as an extremely secular town and a unifying shrine. Founded in the 7th century by Raja Ajpal Chauhan, Ajmer served as the Bastion of he Chauhan kings in Rajasthan . The city passed on to the Mewar kings and was at last annexed by the Mughal Emperor Akbar. Ajmer is renowned for the Shrine dedicated to the Muslim saint lovingly known as Khwaja who longed to unite the people of the land in a common bond or brotherhood. \n" +
                        "\n" +
                        "Ajmer City is well connected to the rest of the country and the world through regular flights plying to and from Jaipur Airport. Jaipur (138 km) is also connected to Ajmer by an excellent bus service and the route takes 2 hours to cover. Ajmer is a major junction in the Indian Railways network and connects the city to other parts of the country. \n" +
                        "\n" +
                        "The Urs Ajmer Sharif is the city's major festival and eulogizes the Sufi seer Khawaja Moinuddin Chishti. Qawwalis and festive songs are sung at the famed durgah or shrine in the city. Millions of devotees visit the city during the Urs and offer prayers and supplications. \n" +
                        "\n" +
                        "The major attractions of the city of Ajmer are:\n" +
                        "Dargah Khwaja Sharif - One of the most famous mosques in India. Muslims, Hindus, Sikhs and Christians visit this 13th century shrine and pay obeisance to the Divine. All prayers are believed to be granted here and the heart of the visitor is filled with a hitherto unknown calm and peace.\n" +
                        "Tara Garh or the Star Fort\n" +
                        "Adhai Din Ka Jhonpda\n" +
                        "Akbar Palace\n" +
                        "Rajputana Museum\n" +
                        "Abdulla Khan's Tomb\n" +
                        "Ana Sagar Lake\n" +
                        "Khobra Bheroon Temple\n" +
                        "Visal Sar\n" +
                        "Foy Sagar\n" +
                        "Man Mahal\n" +
                        "Pushkar Lake\n" +
                        "Nasiyan (Red) Temple\n" +
                        "Mayo College\n" +
                        "Shah Jahan's Mosque\n" +
                        "Circuit House\n" +
                        "The local artisans and vendors flock to Ajmer especially during the Urs and the city resembles a carnival. The streets are lined with colorful displays and handicraft items such as splendid rugs, dyes and block printed textiles, embroidered durries, silver baubles and golden jewellery. The sequined and embroidered leather footwear called Mojaris and the scented natural oils called Atar of Ajmer are famous. Madar gate, Station Road, Purani Mandi, Naya Bazaar, Kaisarganj and Nala Bazaar are favorite shoppers' haunts. \n" +
                        "\n" +
                        "To accommodate the throng of tourists during the Urs and even at other times, Ajmer has well provided accommodation facilities including Luxury Hotels (e.g. Man Singh Palace), Budget Hotels (e.g. RTDC Khadim, Hotel Ambassador, Hotel Chitvan etc.) and other arrangements such as guest houses\n" +
                        "\n" +
                        "Facts of Ajmer District\n" +
                        "State\tRajasthan\n" +
                        "District\tAjmer\n" +
                        "District HQ\tAjmer\n" +
                        "Population (2011)\t2,583,052\n" +
                        "Growth\t18.40%\n" +
                        "Sex Ratio\t951\n" +
                        "Literacy\t69.33\n" +
                        "Area (km2)\t8481\n" +
                        "Density (/km2)\t305\n" +
                        "Tehsils\tAjmer, Beawar, Nasirabad, Masuda, Kekri, Kishangarh\n" +
                        "Lok Sabha Constituencies\tAjmer, Rajsamand\n" +
                        "Assembly Constituencies\tAjmer North, Ajmer South, Beawar, Kekri, Kishangarh, Masuda, Nasirabad, Pushkar\n" +
                        "Languages\tHindi, Rajasthani including Marwari, Dhundhari\n" +
                        "Rivers\tKhari\n" +
                        "Lat-Long\t26.175159,74.771347\n" +
                        "Travel Destinations\tPushkar, Khwaja Moinuddin Chishti Dargaha, Digambar Jain Temple, Salemabad (Nimbark Peeth), Taragarh Fort, Adhai - Din Ka- Jhonpra, Ana Sagar, Government Museum, Nareli Jain Temple etc.\n" +
                        "Government Colleges/Universities\tS.R.K.P. Government P.G.College, S.G.S.G. Government College, S.D. Government College, Govt. Girls College, Government Law College, Government P.G. College etc.");
                break;
            case 4:
                tv_citydetails.setText("Kota\n\n" +"THE LAND OF THE CHAMBAL\n" +
                        "Kota is the third largest city in the state of Rajasthan and is one of the popular tourist destinations. Situated on the banks of the Chambal River, the city of Kota is famous for its distinctive style of paintings, palaces, museums, and places of worship. The city is known for gold jewellery, Doria sarees, silk sarees and the famous Kota stone. \n" +
                        "\n" +
                        "The history of Kota dates back to the 12th century when Rao Deva conquered the territory and founded Hadoti. The independent Rajput state of Kota was carved out of Bundi in 1631. The kingdom of Kota had a turbulent history as it was raided by various Mughal rulers, Maharajas of Jaipur and even the Maratha warlords. The city of Kota is well known all over the world for its architectural splendour comprising beautiful palaces, temples and museums which exhibit the grandeur of the foregone era.");
                break;
            case 5:
                tv_citydetails.setText("Sawai Madhopur\n\n"+"GATEWAY TO RANTHAMBORE\n" +
                        "Cuddled up in the eastern zone of Rajasthan, Sawai Madhopur is one of the prominent conurbations of Rajasthan. Popularly known as the 'Gateway to Ranthambore', the town has seen many historic episodes and reigns. Sawai Madhopur has partly plain and partly undulating hilly terrain. The South and south east part of the district has hills and broken ground which form a part of a vast track of rugged region enclosing the narrow valley of the Chambal river. Surrounded by Vindhyas & Aravalis, this place is a treat for adventure enthusiasts as well as the ones with a fascination for history, with the Ranthambore National park- the most renowned national park in northern India and the Ranthambore Fort which was recently included in the list of UNESCO’s World Heritage sites, being the main attractions. \n" +
                        "\n" +
                        "Passed on from the Chauhan Rajput king, Govinda to Vagabhatta, from RanaKumbha to Akbar and Aurangzeb, the city has been patronized by almost all the rulers. Beautification and renovation of the city has been regularly undertaken in almost all the regimes. Under the rule of Rao Hammir, the last Chauhan ruler the Ranthambore region prospered magnificently. In ancient India the region was more popularly known as Ranthambore. It was much later that it received the name, Sawai Madhopurfrom Maharaja SawaiMadhoSinghji I who is believed to have given the city its current plan in 1765 AD. During the British Rule Sawai Man Singh built a railway line between Jaipur and Sawai Madhopur. As a result it became accessible from a central spot in the state of Rajasthan. Today it has grown as one of the popular tourist destination in India. \n" +
                        "Former state of Karauli, Ranthambore was amongst the strongest forts of medieval India and is linked to Prithviraj, the ruler of Shakambhari who has golden cupolas put on the Jain temple of Ranthambore. To check the increasing incurious of the Marathas, Madho Singh, the ruler of Jaipur State requested for the grant of the fort of Ranthambore but did not succeed.");
                break;
            case 6:
                tv_citydetails.setText("Bikaner\n\n"+"WELCOME TO CAMEL COUNTRY\n" +
                        "Bikaner is home to one of the only two models of the biplane used by the British during World War I. They were presented by the British to Maharaja Ganga Singh, then ruler of the city. Another unique aspect about Bikaner are the sand dunes that are scattered throughout the district, especially from the north-east down to the southern area. Bikaner is situated in the northern region of Rajasthan. One of the earlier established cities, Bikaner still displays its ancient opulence through palaces and forts, built of red sandstone, that have withstood the passage of time. The city boasts of some of the world’s best riding camels and is aptly nicknamed ‘camel country’. It is also home to one of the world’s largest camel research and breeding farms; as well as being known for having its own unique temple dedicated to Karni Mata at Deshnok, called the Rats Temple.\n" +
                        "\n" +
                        "The origins of Bikaner can be traced back to 1488 when a Rathore prince, Rao Bikaji, founded the kingdom. Legend has it that Bikaji, one of Rao Jodhaji’s five sons, left his father’s Durbar in annoyance after an insensitive remark from his father, the illustrious founder of Jodhpur. Bikaji travelled far and when he came upon the wilderness called Jangladesh, he decided to set up his own kingdom and transformed it into an impressive city.");
                break;
            case 7:
                tv_citydetails.setText("Jodhpur\n\n"+"A DELIGHTFUL BLEND OF THE MODERN AND THE TRADITIONAL\n" +
                        "Jodhpur, the second largest city in Rajasthan is popularly known as the Blue City. The name is clearly befitting as most of the architecture – forts, palaces, temples, havelis and even houses are built in vivid shades of blue. The strapping forts that tower this magnificent city sum up to a spectacle you would not want to miss. The mammoth, imposing fortress of Mehrangarh has a landscape dominating a rocky ridge with the eight gates leading out of the fortress. The new city is located outside the structure. Jodhpur is also known for the rare breed of horses known as Marwari or Malani, which are only found here. \n" +
                        "\n" +
                        "Jodhpur marks its origin back to the year of 1459 AD. The history of this prosperous city revolves around the Rathore clan. Rao Jodha, the chief of Rathore Clan is credited with the origin of Jodhpur in India. The city is known to be built in place of the ancient capital, Mandore of the state of Manwar. Hence, the people of Jodhpur and surrounding areas are commonly known as Marwaris. Also, it is believed that the relics of Mandore can still be witnessed in the Mandore Gardens.");
                break;
            case 8:
                tv_citydetails.setText("Jaisalmer\n\n"+"WHERE THE FORTS ARE STILL ALIVE\n" +
                        "If geology interests you, then Jaisalmer is where you need to journey. The Wood Fossil Park or Aakal is located about 15 kilometres away from the city. Here, one can discover and trace geologic tragedies that occurred in the Thar Desert 180 million years ago. The city of Jaisalmer also acts as the guard to western Rajasthan (and India’s) frontier. This 'Golden City’ is located close to the Pakistan border and in close proximity to the Thar Desert. The city’s most prominent landmark is the Jaisalmer Fort, also called Sonar Qila (Golden Fort). Unlike most other forts in India, Jaisalmer Fort is not just a tourist attraction. It houses shops, hotels and ancient havelis (homes) where generations continue to live.\n" +
                        "\n" +
                        "Jaisalmer traces its inception to the 12th century. History tells us of Rawal Jaisal, the eldest heir of the Rawal of Deoraj, was passed over for the throne of Lodurva and a younger half-brother was crowned king. Rawal Jaisal went looking for a new location to set up his capital when he came across sage Eesul. The sage told him about Krishna’s prophecy which said that a descendant of his Yaduvanshi clan would found a new kingdom at this same spot. It was in 1156 that Rawal Jaisal constructed a mud fort, named it Jaisalmer after himself and declared it his capital.");
                break;
            case 9:
                tv_citydetails.setText("Pushkar\n\n"+"THE TOWN OF FAIRS AND FESTIVITIES\n" +
                        "Pushkar is one of the oldest cities in India. Located to the northwest of Ajmer, the tranquil city of Pushkar is a favoured destination for thousands of tourists and devotees flocking to Rajasthan. Situated at a height of 510 metres, Pushkar is surrounded by hillocks on three sides. The ‘Nag Pahar’, literally meaning Snake Mountain forms a natural border between Ajmer and Pushkar. Known as ‘the rose garden of Rajasthan’, the essence of the famous Pushkar rose is exported all over the world. Along with an interesting mythological history, a legacy of timeless architectural heritage makes Pushkar a fascinating city.\n" +
                        "\n" +
                        "According to legends, Lord Brahma, believed to be the creator of the Universe dropped a lotus to the ground leading to the immediate creation of a lake. He then decided to name the place after the flower, and thus the name, Pushkar. The city of Pushkar is home to the only temple dedicated to Lord Brahma in the whole world. Hindus consider a journey to Pushkar to be the ultimate pilgrimage that must be undertaken to attain salvation.");
                break;
        }


    }
}

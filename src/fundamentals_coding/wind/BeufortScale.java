package fundamentals_coding.wind;

public enum BeufortScale {

    SCALE_0("Calm", " 0m ", "Sea like mirror", "Smoke rises vertically" ),
    SCALE_1("Light air", "0 - 0.3m", "Ripples with appearance of scales are formed, without foam crests", "Directions shown by smoke drift but not by wind vanes"),
    SCALE_2("Light breeze", "0.3 - 0.6m", "Small wavelets still short but more pronounced; crests have a glassy appearance but do not break", "Wind felt on face; leaves rustle; wind vane moved by wind"),
    SCALE_3("Gentle breeze", "0.6 - 1.2m", "Large wavelets; crests begin to break; foam of glassy appearance; perhaps scattered white horses", "Leaves and small twigs in constant motion; light flags extended."),
    SCALE_4("Moderate breeze", "1 - 2m", "Small waves becoming longer; fairly frequent white horses", "Small waves becoming longer; fairly frequent white horses"),
    SCALE_5("Fresh breeze", "2 - 3m", "Moderate waves taking a more pronounced long form; many white horses are formed; chance of some spray", "Small trees in leaf begin to sway; crested wavelets form on inland waters."),
    SCALE_6("Strong breeze", "3 - 4m", "Large waves begin to form; the white foam crests are more extensive everywhere; probably some spray", "Large branches in motion; whistling heard in telegraph wires; umbrellas used with difficulty."),
    SCALE_7("High wind, moderate gale, near gale", "4 - 5.5m", "Sea heaps up and white foam from breaking waves begins to be blown in streaks along the direction of the wind", "Whole trees in motion; inconvenience felt when walking against the wind." ),
    SCALE_8("Gale, fresh gale", "5.5 - 7.5m", "Moderately high waves of greater length; edges of crests break into spindrift; foam is blown in well-marked streaks along the direction of the wind", "Twigs break off trees; generally impedes progress."),
    SCALE_9("Strong/severe gale", "7 - 10m", "High waves; dense streaks of foam along the direction of the wind; sea begins to roll; spray affects visibility", "Slight structural damage (chimney pots and slates removed)." ),
    SCALE_10("Storm, whole gale", "9 - 12.5m", "Very high waves with long overhanging crests; resulting foam in great patches is blown in dense white streaks along the direction of the wind; on the whole the surface of the sea takes on a white appearance; rolling of the sea becomes heavy; visibility affected", "Seldom experienced inland; trees uprooted; considerable structural damage."),
    SCALE_11("Violent storm", "11.5 - 16m", "Exceptionally high waves; small- and medium-sized ships might be for a long time lost to view behind the waves; sea is covered with long white patches of foam; everywhere the edges of the wave crests are blown into foam; visibility affected", "Very rarely experienced; accompanied by widespread damage."),
    SCALE_12("Hurricane force!!!", ">=14m", "	The air is filled with foam and spray; sea is completely white with driving spray; visibility very seriously affected", "Devastation");

    private String name;
    private String maxWaveHeight;
    private String seaConditions;
    private String landConditions;

    BeufortScale(String name, String maxWaveHeight, String seaConditions, String landConditions ) {
        this.name = name;
        this.maxWaveHeight = maxWaveHeight;
        this.seaConditions = seaConditions;
        this.landConditions = landConditions;
    }

    public String getName() {
        return name;
    }

    public String getMaxWaveHeight() {
        return maxWaveHeight;
    }

    public String getSeaConditions() {
        return seaConditions;
    }

    public String getLandConditions() {
        return landConditions;
    }
}

package es.esy.pskovbus.pskovbus




class StopData {


    fun getStopNameArray(): MutableList<String>{
       var stopArray:MutableList<String> =mutableListOf()
            val l = stopDataArray.size

            for (i in 0 until l) {

                stopArray.add(stopDataArray[i].name)
            }
            return stopArray
        }

    internal var stop1 = Stop("10 Школа от дамбы ", 101,  118, doubleArrayOf(57.810283, 28.302834), intArrayOf(6, 16))
    internal var stop2 = Stop("10 Школа к дамбе ", 102,117, doubleArrayOf(57.810695, 28.300882), intArrayOf(6, 16))
    internal var stop3 = Stop("12 Школа в центр ", 89,39, doubleArrayOf(57.828626, 28.339010), intArrayOf(5, 11, 22, 30))
    internal var stop4 = Stop("12 Школа из центра ", 90,40, doubleArrayOf(57.827278, 28.338221), intArrayOf(11, 22, 30))
    internal var stop5 = Stop("Алехина ул. в центр", 50001, 4,doubleArrayOf(57.835927, 28.286727), intArrayOf(1, 16, 18))
    internal var stop6 =        Stop("Алехина ул. из центра", 50050, 66,doubleArrayOf(57.836187, 28.286011), intArrayOf(1, 16, 18))
    internal var stop7 = Stop("Алмазная ул. к мосту ", 85,183, doubleArrayOf(57.828755, 28.292452), intArrayOf(16, 22))
    internal var stop8 = Stop("Алмазная ул. от моста ", 86, 184,doubleArrayOf(57.829110, 28.292999), intArrayOf(16, 22))
    internal var stop9 = Stop("Архив", 40002,33, doubleArrayOf(57.832734, 28.353279), intArrayOf(5, 11, 22, 23, 25, 30))
    internal var stop10 = Stop("Балтийская", 3,303, doubleArrayOf(57.810565, 28.264685), intArrayOf(17))
    internal var stop11 = Stop("Балтийская ул. (школа 27) ", 128,302, doubleArrayOf(57.810012, 28.264671), intArrayOf(2))
    internal var stop12 = Stop("Белинского ул.", 91,38, doubleArrayOf(57.830991, 28.341303), intArrayOf(11, 22, 30))
    internal var stop13 = Stop("Белый мох в город", 4,209, doubleArrayOf(57.827936, 28.446735), intArrayOf(9))
    internal var stop14 = Stop("Ваулино в город", 5,240, doubleArrayOf(57.873175, 28.318782), intArrayOf(7))
    internal var stop15 = Stop("Венская в город ", 126,323, doubleArrayOf(57.807414, 28.253457), intArrayOf(25))
    internal var stop16 = Stop("Виадук к вокзалу ", 118, 155,doubleArrayOf(57.807572, 28.364888), intArrayOf(14, 23))
    internal var stop17 = Stop("Виадук от вокзала ", 119,154, doubleArrayOf(57.807511, 28.365263), intArrayOf(14, 23))
    internal var stop18 = Stop("Вокзал",        10006, 31,       doubleArrayOf(57.805280, 28.361365),        intArrayOf(1, 2, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 23)    )
    internal var stop19 = Stop("Вокзал в Череху", 10007,123, doubleArrayOf(57.804043, 28.359638), intArrayOf(6))
    internal var stop20 =        Stop("Гагарина ул. в центр ", 150064,29, doubleArrayOf(57.810486, 28.358281), intArrayOf(1, 4, 14, 15, 17))
    internal var stop21 = Stop(        "Гагарина ул. к вокзалу ",        150065,   28,     doubleArrayOf(57.809429, 28.361623),        intArrayOf(1, 4, 9, 12, 14, 15, 17)    )
    internal var stop22 =        Stop("Гагарина ул. (Фабрициуса) ", 114,47, doubleArrayOf(57.805678, 28.353606), intArrayOf(2, 5, 6, 11, 16))
    internal var stop23 = Stop("Городская больница к центру ", 75,149, doubleArrayOf(57.820072, 28.302477), intArrayOf(14))
    internal var stop24 = Stop("Городская больница от центра ", 76,150, doubleArrayOf(57.820078, 28.300857), intArrayOf(14))
    internal var stop25 =        Stop("Горького ул. ", 103,62, doubleArrayOf(57.818392, 28.322221), intArrayOf(3, 4, 7, 14, 15, 17, 18, 22, 25, 30))
    internal var stop26 =        Stop("Гражданская ул. от вокзала ", 123,44, doubleArrayOf(57.807877, 28.345943), intArrayOf(8, 11, 19))
    internal var stop27 = Stop("Гражданская ул.  ", 124,43, doubleArrayOf(57.808427, 28.346259), intArrayOf(11))
    internal var stop28 = Stop("Дамба от моста ", 106,76, doubleArrayOf(57.804756, 28.324535), intArrayOf(2, 5))
    internal var stop29 = Stop("Дамба к мосту ", 107,75, doubleArrayOf(57.804719, 28.324285), intArrayOf(2, 5, 8, 19))
    internal var stop30 =        Stop("Детская обл. больница к центру", 47,147, doubleArrayOf(57.819682, 28.297273), intArrayOf(14))
    internal var stop31 =        Stop("Детская обл. больница от центра ", 74,148, doubleArrayOf(57.819720, 28.296061), intArrayOf(14))
    internal var stop32 = Stop(        "Детский парк к пл.Ленина",        20008,     23,   doubleArrayOf(57.815305, 28.33928),        intArrayOf(1, 3, 4, 8, 11, 14, 15, 17)    )
    internal var stop33 = Stop(        "Детский парк к вокзалу",        20009,   22,     doubleArrayOf(57.815660, 28.337269),        intArrayOf(1, 3, 4, 5, 8, 11, 14, 15, 17)    )
    internal var stop34 = Stop("Дом офицеров от дамбы ", 79,122, doubleArrayOf(57.805466, 28.319627), intArrayOf(6, 16, 19))
    internal var stop35 = Stop("Дом офицеров к дамбе ", 80,121, doubleArrayOf(57.805847, 28.317808), intArrayOf(6, 16, 19))
    internal var stop36 = Stop("Западная ", 69,65, doubleArrayOf(57.813336, 28.290657), intArrayOf(7, 15, 17, 22, 30))
    internal var stop37 = Stop("Звездная", 10, 35,doubleArrayOf(57.836884, 28.347902), intArrayOf(5, 11, 22, 23, 25, 30))
    internal var stop38 =        Stop("Ижорского бат-на в центр", 52,8, doubleArrayOf(57.835864, 28.299417), intArrayOf(1, 18, 22))
    internal var stop39 =        Stop("Ижорского бат-на из центра", 53, 9,doubleArrayOf(57.835873, 28.298349), intArrayOf(1, 18, 22))
    internal var stop40 = Stop("Инженерная в город", 36, 175,doubleArrayOf(57.82383, 28.362041), intArrayOf(3))
    internal var stop41 =        Stop("Ипподромная в центр (25маршрут) ", 97,237, doubleArrayOf(57.833196, 28.332446), intArrayOf(25))
    internal var stop42 =        Stop("Ипподромная из центра (25маршрут) ", 98, 236,doubleArrayOf(57.832924, 28.331979), intArrayOf(25))
    internal var stop43 =        Stop("Ипподромная в центр ( Индустриальная ) ", 116,173, doubleArrayOf(57.821966, 28.356794), intArrayOf(3))
    internal var stop44 =        Stop("Ипподромная из центра ( Индустриальная ) ", 117,172, doubleArrayOf(57.820729, 28.355485), intArrayOf(3, 5))
    internal var stop45 = Stop("Колокольная в центр", 41,2, doubleArrayOf(57.836805, 28.271887), intArrayOf(1, 16))
    internal var stop46 = Stop("Колокольная из центра", 42,3, doubleArrayOf(57.836805, 28.271887), intArrayOf(1, 16))
    internal var stop47 = Stop(        "Коммунальная в центр",        90011, 54,       doubleArrayOf(57.818869, 28.292523),        intArrayOf(2, 3, 4, 6, 16, 17, 18, 22, 25, 30)    )
    internal var stop48 = Stop("Коммунальная к Чудской", 90045, 185,doubleArrayOf(57.820269, 28.293090), intArrayOf(16, 22))
    internal var stop49 = Stop("Корытово в центр", 12,86, doubleArrayOf(57.784224, 28.342333), intArrayOf(8))
    internal var stop50 =        Stop("Кошевого ул. в центр ", 60,18, doubleArrayOf(57.825135, 28.331292), intArrayOf(1, 7, 18, 25))
    internal var stop51 =        Stop("Кошевого ул. из центра ", 61,19, doubleArrayOf(57.825379, 28.330901), intArrayOf(1, 7, 18, 25))
    internal var stop52 = Stop("Кресты в центр", 990013,113, doubleArrayOf(57.795124, 28.415793), intArrayOf(4, 9, 12))
    internal var stop53 = Stop("Кресты из центра", 990048, 112,doubleArrayOf(57.795124, 28.415793), intArrayOf(4, 9, 12))
    internal var stop54 = Stop("Ледовый дворец", 70,305, doubleArrayOf(57.812767, 28.269174), intArrayOf(17))
    internal var stop55 = Stop("Ледовый дворец из центра ", 131,65, doubleArrayOf(57.812353, 28.267004), intArrayOf(2))
    internal var stop56 =        Stop("Ленина пл. ДКП", 30014,21, doubleArrayOf(57.820033, 28.331829), intArrayOf(1, 7, 11, 18, 22, 25, 30))
    internal var stop57 = Stop(        "Ленина пл. кт.Октябрь",        30015,  64,      doubleArrayOf(57.819239, 28.331239),        intArrayOf(3, 4, 5, 7, 8, 14, 15, 17, 18, 19, 22, 25, 30)    )
    internal var stop58 = Stop("Ленина пл. Кремль", 30016,20, doubleArrayOf(57.820517, 28.331293), intArrayOf(1, 11))
    internal var stop59 =        Stop("Ленина пл. Сбербанк", 30017,63, doubleArrayOf(57.818599, 28.332312), intArrayOf(3, 4, 5, 14, 15, 17))
    internal var stop60 = Stop(        "Летний Сад от вокзала",        140018,   25,  doubleArrayOf(57.813817, 28.345617),        intArrayOf(1, 3, 4, 8, 11, 14, 15, 17)    )
    internal var stop61 =        Stop("Летний Сад к вокзалу", 140019,24,doubleArrayOf(57.813717, 28.345392), intArrayOf(1, 4, 11, 14, 15, 17))
    internal var stop62 =        Stop("Летний сад (Кузнецкая ул.) ", 115,171,doubleArrayOf(57.814757, 28.347748), intArrayOf(3, 5))
    internal var stop63 = Stop("Льнокомбинат в центр", 54, 12, doubleArrayOf(57.834625, 28.311733), intArrayOf(1, 18))
    internal var stop64 = Stop("Льнокомбинат из центра", 55,13, doubleArrayOf(57.834381, 28.312254), intArrayOf(1, 18))
    internal var stop65 = Stop("Люксембург Р. ул. ", 110,170, doubleArrayOf(57.815138, 28.321016), intArrayOf(2))
    internal var stop66 = Stop(        "Маяк от центра",        70020,   59,     doubleArrayOf(57.816853, 28.304212),        intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30)    )
    internal var stop67 =        Stop("Маяк в центр", 70021,58, doubleArrayOf(57.817214, 28.307420), intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30))
    internal var stop68 = Stop("Мебельный магазин ", 111, 167,doubleArrayOf(57.814259, 28.310253), intArrayOf(2))
    internal var stop69 =        Stop("Металлистов ул. в центр ", 62, 27,doubleArrayOf(57.812012, 28.352448), intArrayOf(1, 4, 14, 15, 17))
    internal var stop70 =        Stop("Металлистов ул. к вокзалу", 63,26, doubleArrayOf(57.81162, 28.353327), intArrayOf(1, 4, 14, 15, 17))
    internal var stop71 = Stop("Мясокомбинат в центр", 57, 14,doubleArrayOf(57.832137, 28.315389), intArrayOf(1, 7, 18))
    internal var stop72 = Stop("Мясокомбинат из центра ", 58, 15,doubleArrayOf(57.832455, 28.31503), intArrayOf(1, 7, 18))
    internal var stop73 = Stop("Народная от дамбы ", 81,120, doubleArrayOf(57.808513, 28.309488), intArrayOf(6, 16, 19))
    internal var stop74 = Stop("Народная к дамбе ", 82,119, doubleArrayOf(57.809031, 28.306929), intArrayOf(6, 16, 19))
    internal var stop75 = Stop("Невского в центр", 60022,16, doubleArrayOf(57.828292, 28.322583), intArrayOf(1, 7, 18, 25))
    internal var stop76 =        Stop("Невского из центра ", 60059,17, doubleArrayOf(57.829055, 28.321582), intArrayOf(1, 7, 18, 25))
    internal var stop77 =        Stop("Новоселов ул. ", 94,34, doubleArrayOf(57.835138, 28.354344), intArrayOf(5, 11, 22, 23, 25, 30))
    internal var stop78 = Stop("Обл.Больница от Дамбы", 23, 72,doubleArrayOf(57.813201, 28.322610), intArrayOf(2, 5))
    internal var stop79 = Stop("Обл.Больница к Дамбе", 24,71, doubleArrayOf(57.812846, 28.322331), intArrayOf(2, 5, 8, 19))
    internal var stop80 = Stop("Овсище в центр", 120039,6, doubleArrayOf(57.835254, 28.2919), intArrayOf(1, 16, 18))
    internal var stop81 = Stop("Овсище из центра", 120051, 7,doubleArrayOf(57.835378, 28.292545), intArrayOf(1, 16, 18))
    internal var stop82 = Stop(        "Петровская в центр",        25,  60,      doubleArrayOf(57.817870, 28.315703),        intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30)    )
    internal var stop83 = Stop(        "Петровская ул. из центра ",        66,     61,   doubleArrayOf(57.818229, 28.318507),        intArrayOf(3, 4, 7, 15, 17, 18, 22, 25, 30)    )
    internal var stop84 =        Stop("Петровская в центр (на Коммунальной) ", 77,151, doubleArrayOf(57.820999, 28.315191), intArrayOf(14))
    internal var stop85 =        Stop("Петровская из центра (на Коммунальной) ", 78,152, doubleArrayOf(57.821222, 28.316602), intArrayOf(14))
    internal var stop86 =        Stop("Печорская", 44,50, doubleArrayOf(57.815932, 28.280924), intArrayOf(2, 3, 4, 6, 14, 17, 18, 22, 25, 30))
    internal var stop87 =        Stop("Печорская тк.Гулливер ", 71,51, doubleArrayOf(57.815539, 28.279221), intArrayOf(2, 3, 4, 6, 14, 18, 25))
    internal var stop88 = Stop("Писковичи в город", 26,295, doubleArrayOf(57.862994, 28.209880), intArrayOf(18))
    internal var stop89 =        Stop("Пл.Победы вечный огонь", 110027,102, doubleArrayOf(57.807767, 28.339227), intArrayOf(2, 6, 16))
    internal var stop90 =        Stop("Пл.Победы ГПТУ1", 110028,101, doubleArrayOf(57.806753, 28.338562), intArrayOf(2, 6, 8, 16, 19))
    internal var stop91 = Stop("Политехнический колледж", 43,191, doubleArrayOf(57.841663, 28.30196), intArrayOf(22))
    internal var stop92 = Stop("Псковкирпич", 29,219, doubleArrayOf(57.756918, 28.411393), intArrayOf(12))
    internal var stop93 = Stop("Псковпищепром в центр ", 95,235, doubleArrayOf(57.831653, 28.324451), intArrayOf(25))
    internal var stop94 = Stop("Псковпищепром из центра ", 96,234, doubleArrayOf(57.831467, 28.324199), intArrayOf(25))
    internal var stop95 = Stop("Пчеловод", 37,166, doubleArrayOf(57.827654, 28.406357), intArrayOf(14))
    internal var stop96 = Stop("Рижский пр. от дамбы ", 100083,116, doubleArrayOf(57.813310, 28.294857), intArrayOf(6, 16))
    internal var stop97 = Stop("Рижский пр. к дамбе ", 100084,115, doubleArrayOf(57.813196, 28.294240), intArrayOf(6, 16))
    internal var stop98 = Stop("Рижское шоссе ", 112,256, doubleArrayOf(57.808003, 28.270249), intArrayOf(7, 15, 17, 25))
    internal var stop99  =        Stop("Рижское шоссе в город ", 129,255, doubleArrayOf(57.807680, 28.269669), intArrayOf(2, 7, 15, 25))
    internal var stop100 = Stop("Родина", 30, 275,doubleArrayOf(57.831747, 28.255382), intArrayOf(25))
    internal var stop101 = Stop(        "Рокоссовского ул.",        80031,  114,      doubleArrayOf(57.814091, 28.274265),        intArrayOf(2, 3, 4, 6, 14, 17, 18, 22, 25, 30)    )
    internal var stop102 =        Stop("Рокоссовского ул. из центра ", 80127,49, doubleArrayOf(57.814355, 28.274694), intArrayOf(2, 3, 4, 6, 14, 25))
    internal var stop103 = Stop("Северная", 56,32, doubleArrayOf(57.837745, 28.307675), intArrayOf(1, 18))
    internal var stop104 = Stop("Снятная Гора", 32,301, doubleArrayOf(57.836713, 28.271679), intArrayOf(1, 16))
    internal var stop105 = Stop("Советской армии ул. в центр ", 121,126, doubleArrayOf(57.794856, 28.346387), intArrayOf(6))
    internal var stop106 =        Stop("Советской армии ул. из центра ", 122,127, doubleArrayOf(57.794094, 28.346334), intArrayOf(6))
    internal var stop107 =        Stop("Текстильная ул. в центр ", 92,36, doubleArrayOf(57.833858, 28.344441), intArrayOf(5, 11, 22, 30))
    internal var stop108 =        Stop("Текстильная ул. из центра ", 93, 37,doubleArrayOf(57.832842, 28.345471), intArrayOf(11, 22, 23, 25, 30))
    internal var stop109 = Stop("Телецентр", 33, 68,doubleArrayOf(57.810524, 28.279955), intArrayOf(7, 15, 17, 22, 30))
    internal var stop110 = Stop("Телецентр в город ", 130,67, doubleArrayOf(57.810443, 28.280193), intArrayOf(7, 15))
    internal var stop111 = Stop(        "Торговый дом в центр ",        72, 52,       doubleArrayOf(57.817642, 28.284506),        intArrayOf(2, 3, 4, 6, 14, 17, 18, 22, 25, 30)    )
    internal var stop112 =        Stop("Торговый дом из центра ", 73,53, doubleArrayOf(57.819164, 28.286996), intArrayOf(2, 3, 4, 6, 14, 18, 25))
    internal var stop113 =        Stop("Торговый центр от вокзала", 160104,46, doubleArrayOf(57.806477, 28.349439), intArrayOf(2, 5, 6, 11, 16))
    internal var stop114 =        Stop("Торговый центр к вокзалу", 160105,45, doubleArrayOf(57.806793, 28.346642), intArrayOf(2, 5, 6, 11, 16))
    internal var stop115 =        Stop("Труда ул. в центр ", 87,41, doubleArrayOf(57.824943, 28.335590), intArrayOf(5, 11, 22, 30))
    internal var stop116 = Stop("Труда ул. из центра ", 88,42, doubleArrayOf(57.824564, 28.335391), intArrayOf(11, 22, 30))
    internal var stop117 = Stop("Тямша в город ", 120,66, doubleArrayOf(57.745398, 28.153643), intArrayOf(15))
    internal var stop118 =        Stop("Универмаг ", 68,57, doubleArrayOf(57.815924, 28.301209), intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30))
    internal var stop119 = Stop("Учхоз в город ", 125, 232,doubleArrayOf(57.790509, 28.413025), intArrayOf(4, 12))
    internal var stop120 = Stop("Храм Невского от дамбы ", 108,74, doubleArrayOf(57.808730, 28.322812), intArrayOf(2, 5))
    internal var stop121 =        Stop("Храм Невского к дамбе ", 109, 73,doubleArrayOf(57.808666, 28.322622), intArrayOf(2, 5, 8, 19))
    internal var stop122 = Stop("Цементный склад", 38,190, doubleArrayOf(57.79003, 28.286598), intArrayOf(19))
    internal var stop123 =        Stop("Центральная Гор.Библиотека ", 113,70, doubleArrayOf(57.817259, 28.321240), intArrayOf(2, 5, 8, 19))
    internal var stop124 = Stop("Череха в центр", 34,66, doubleArrayOf(57.745008, 28.370854), intArrayOf(6))
    internal var stop125 = Stop("Чудская в центр", 130040,10, doubleArrayOf(57.837909, 28.304449), intArrayOf(1, 18, 22))
    internal var stop126 = Stop("Чудская из центра", 130049,11, doubleArrayOf(57.838381, 28.304666), intArrayOf(1, 18, 22))
    internal var stop127 = Stop("Энтузиастов пр. в центр ", 99, 239,doubleArrayOf(57.835692, 28.343322), intArrayOf(25))
    internal var stop128 = Stop("Энтузиастов пр. из центра", 100,238, doubleArrayOf(57.835582, 28.343996), intArrayOf(25))
    internal var stop129 = Stop(        "Юбилейная в центр",        100035,    55,    doubleArrayOf(57.814272, 28.295574),        intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30)    )
    internal var stop130 = Stop(        "Юбилейная из центра ",        100067,    56 ,   doubleArrayOf(57.814750, 28.296054),        intArrayOf(2, 3, 4, 7, 15, 17, 18, 22, 25, 30)    )
   //nternal var stop131

    //            Stop stop =new Stop( " ", ,                    new double[]{}, new int[]{});


     val stopDataArray = arrayOf(
        stop1,
        stop2,
        stop3,
        stop4,
        stop5,
        stop6,
        stop7,
        stop8,
        stop9,
        stop10,
        stop11,
        stop12,
        stop13,
        stop14,
        stop15,
        stop16,
        stop17,
        stop18,
        stop19,
        stop20,
        stop21,
        stop22,
        stop23,
        stop24,
        stop25,
        stop26,
        stop27,
        stop28,
        stop29,
        stop30,
        stop31,
        stop32,
        stop33,
        stop34,
        stop35,
        stop36,
        stop37,
        stop38,
        stop39,
        stop40,
        stop41,
        stop42,
        stop43,
        stop44,
        stop45,
        stop46,
        stop47,
        stop48,
        stop49,
        stop50,
        stop51,
        stop52,
        stop53,
        stop54,
        stop55,
        stop56,
        stop57,
        stop58,
        stop59,
        stop60,
        stop61,
        stop62,
        stop63,
        stop64,
        stop65,
        stop66,
        stop67,
        stop68,
        stop69,
        stop70,
        stop71,
        stop72,
        stop73,
        stop74,
        stop75,
        stop76,
        stop77,
        stop78,
        stop79,
        stop80,
        stop81,
        stop82,
        stop83,
        stop84,
        stop85,
        stop86,
        stop87,
        stop88,
        stop89,
        stop90,
        stop91,
        stop92,
        stop93,
        stop94,
        stop95,
        stop96,
        stop97,
        stop98,
        stop99,
        stop100,
        stop101,
        stop102,
        stop103,
        stop104,
        stop105,
        stop106,
        stop107,
        stop108,
        stop109,
        stop110,
        stop111,
        stop112,
        stop113,
        stop114,
        stop115,
        stop116,
        stop117,
        stop118,
        stop119,
        stop120,
        stop121,
        stop122,
        stop123,
        stop124,
        stop125,
        stop126,
        stop127,
        stop128,
        stop129,
        stop130

    )


    fun getStopById(stopId: Int): Stop ?{
        var stophere: Stop? =null
        for (i in stopDataArray.indices) {
            if (stopDataArray[i].id == stopId) {
                stophere = stopDataArray[i]
                break

            }

        }
        return stophere
    }


    fun getSiteId(stopId: Int):Int {
        var siteId=0

        for (i in stopDataArray.indices) {
            if (stopDataArray[i].id == stopId) {
                siteId = stopDataArray[i].siteId
                break

            }

        }
        return siteId
    }

    fun getGeoCoord(stopId: Int): DoubleArray {
        val pos = getPosById(stopId)

        return stopDataArray[pos].geo
    }


    fun getStopNameById(id: Int): String {
        val pos = getPosById(id)
        return stopDataArray[pos].name
    }


    fun getId(pos: Int): Int {
        return stopDataArray[pos].id
    }

    fun getPosById(id: Int): Int {
        var result = 0
        for (i in stopDataArray.indices) {
            if (stopDataArray[i].id ==id) {
                result = i
                break
            }
        }
        return result
    }
}
package com.abubakir.model.shared;

public enum LEVEL_THRESHOLD {

    L1(1, 300, 300),
    L2(2, 450, 750),
    L3(3, 630, 1380),
    L4(4, 970, 2350),
    L5(5, 1440, 3790),
    L6(6, 1940, 5730),
    L7(7, 3000, 8730),
    L8(8, 3920, 12650),
    L9(9, 4970, 17620),
    L10(10, 5900, 23520),
    L11(11, 7430, 30950),
    L12(12, 8620, 39570),
    L13(13, 10200, 49770),
    L14(14, 11300, 61070),
    L15(15, 13100, 74170),
    L16(16, 15200, 89370),
    L17(17, 17400, 106770),
    L18(18, 19600, 126370),
    L19(19, 21900, 148270),
    L20(20, 24300, 172570),
    L21(21, 27400, 199970),
    L22(22, 30600, 230570),
    L23(23, 33900, 264470),
    L24(24, 37300, 301770),
    L25(25, 40800, 342570),
    L26(26, 49200, 391770),
    L27(27, 54600, 446370),
    L28(28, 61900, 508270),
    L29(29, 65600, 573870),
    L30(30, 68400, 642270),
    L31(31, 74000, 716270),
    L32(32, 82700, 798970),
    L33(33, 88700, 887670),
    L34(34, 95000, 982670),
    L35(35, 102000, 1084670),
    L36(36, 113000, 1197670),
    L37(37, 121000, 1318670),
    L38(38, 133000, 1451670),
    L39(39, 142000, 1593670),
    L40(40, 155000, 1748670),
    L41(41, 163000, 1911670),
    L42(42, 171000, 2082670),
    L43(43, 179000, 2261670),
    L44(44, 187000, 2448670),
    L45(45, 195000, 2643670),
    L46(46, 214000, 2857670),
    L47(47, 229000, 3086670),
    L48(48, 244000, 3330670),
    L49(49, 259000, 3589670),
    L50(50, 421000, 4010670),
    L51(51, 500000, 4510670),
    L52(52, 580000, 5090670),
    L53(53, 663000, 5753670),
    L54(54, 749000, 6502670),
    L55(55, 837000, 7339670),
    L56(56, 927000, 8266670),
    L57(57, 1019000, 9285670),
    L58(58, 1114000, 10399670),
    L59(59, 1211000, 11610670),
    L60(60, 1387000, 12997670),
    L61(61, 1456000, 14453670),
    L62(62, 1534000, 15987670),
    L63(63, 1621000, 17608670),
    L64(64, 1720000, 19328670),
    L65(65, 1834000, 21162670),
    L66(66, 1968000, 23130670),
    L67(67, 2126000, 25256670),
    L68(68, 2137000, 27393670),
    L69(69, 2550000, 29943670),
    L70(70, 2923000, 32866670),
    L71(71, 3018000, 35884670),
    L72(72, 3153000, 39037670),
    L73(73, 3324000, 42361670),
    L74(74, 3532000, 45893670),
    L75(75, 3770600, 49664270),
    L76(76, 4066000, 53730270),
    L77(77, 4377000, 58107270),
    L78(78, 4777000, 62884270),
    L79(79, 5256000, 68140270),
    L80(80, 5992000, 74132270),
    L81(81, 6171000, 80303270),
    L82(82, 6942000, 87245270),
    L83(83, 7205000, 94450270),
    L84(84, 7948000, 102398270),
    L85(85, 8287000, 110685270),
    L86(86, 9231000, 119916270),
    L87(87, 9529000, 129445270),
    L88(88, 10459000, 139904270),
    L89(89, 10838000, 150742270);

    private final int level;
    private final int experienceToLevelUp;
    private final int totalExperienceOnStartOfNextLevel;

    LEVEL_THRESHOLD(int level, int experienceToLevelUp, int totalExperienceOnStartOfNextLevel) {
        this.level = level;
        this.experienceToLevelUp = experienceToLevelUp;
        this.totalExperienceOnStartOfNextLevel = totalExperienceOnStartOfNextLevel;
    }

    public int getLevel() {
        return level;
    }

    public int getExperienceToLevelUp() {
        return experienceToLevelUp;
    }

    public int getTotalExperienceOnStartOfNextLevel() {
        return totalExperienceOnStartOfNextLevel;
    }
}

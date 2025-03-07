package Solutions.a_BinaryTree.UE04_RotateTree;

public class Main
{
    public static void main(String[] args)
    {
        Tree tvShowTree = new Tree();
        int nodeCount = 0;

        // Tree mit Beispielserien befüllen
        fillTvShowTree(tvShowTree);

        // Wie wir sehen ist der Baum entartet. Eine Suche würde relativ lange dauern.
        System.out.println("MaxDepth: " + tvShowTree.getMaxDepth());
        nodeCount = tvShowTree.getNodeCount();
        System.out.println("Count: " + nodeCount);

        // Einmal rechts rotieren bitte
        tvShowTree.rotateRight();
        System.out.println("MaxDepth nach Rechtsrotation: " + tvShowTree.getMaxDepth());

        // Einmal links rotieren bitte
        tvShowTree.rotateLeft();
        System.out.println("MaxDepth nach Linksrotation: " + tvShowTree.getMaxDepth());

        // Einmal links rotieren bitte
        tvShowTree.rotateLeft();
        System.out.println("MaxDepth nach Linksrotation: " + tvShowTree.getMaxDepth());
    }

    private static void fillTvShowTree(Tree tvShowTree)
    {
        tvShowTree.addNode(new TvShow(1, "Planet Earth II (2016)", 9.4));
        tvShowTree.addNode(new TvShow(2, "Planet Earth (2006)", 9.4));
        tvShowTree.addNode(new TvShow(3, "Band of Brothers (2001)", 9.4));
        tvShowTree.addNode(new TvShow(4, "Breaking Bad (2008)", 9.4));
        tvShowTree.addNode(new TvShow(5, "Chernobyl (2019)", 9.4));
        tvShowTree.addNode(new TvShow(6, "Blue Planet II (2017)", 9.3));
        tvShowTree.addNode(new TvShow(7, "The Wire (2002)", 9.3));
        tvShowTree.addNode(new TvShow(8, "Our Planet (2019)", 9.3));
        tvShowTree.addNode(new TvShow(9, "Game of Thrones (2011)", 9.2));
        tvShowTree.addNode(new TvShow(10, "Cosmos: A Spacetime Odyssey (2014)", 9.2));
        tvShowTree.addNode(new TvShow(11, "Cosmos (1980)", 9.2));
        tvShowTree.addNode(new TvShow(12, "Rick and Morty (2013)", 9.2));
        tvShowTree.addNode(new TvShow(13, "Avatar: The Last Airbender (2005)", 9.2));
        tvShowTree.addNode(new TvShow(14, "The Sopranos (1999)", 9.2));
        tvShowTree.addNode(new TvShow(15, "The World at War (1973)", 9.1));
        tvShowTree.addNode(new TvShow(16, "Life (2009)", 9.1));
        tvShowTree.addNode(new TvShow(17, "Sherlock (2010)", 9.1));
        tvShowTree.addNode(new TvShow(18, "Hagane no renkinjutsushi (2009)", 9.1));
        tvShowTree.addNode(new TvShow(19, "The Vietnam War (2017)", 9.1));
        tvShowTree.addNode(new TvShow(20, "The Twilight Zone (1959)", 9));
        tvShowTree.addNode(new TvShow(21, "The Beatles Anthology (1995)", 9));
        tvShowTree.addNode(new TvShow(22, "Planet der Menschen (2011)", 9));
        tvShowTree.addNode(new TvShow(23, "Sahsiyet (2018)", 9));
        tvShowTree.addNode(new TvShow(24, "The Blue Planet (2001)", 9));
        tvShowTree.addNode(new TvShow(25, "Batman: The Animated Series (1992)", 9));
        tvShowTree.addNode(new TvShow(26, "Firefly (2002)", 9));
        tvShowTree.addNode(new TvShow(27, "Frozen Planet (2011)", 9));
        tvShowTree.addNode(new TvShow(28, "Dekalog (1989)", 8.9));
        tvShowTree.addNode(new TvShow(29, "True Detective (2014)", 8.9));
        tvShowTree.addNode(new TvShow(30, "The Civil War (1990)", 8.9));
        tvShowTree.addNode(new TvShow(31, "Death Note: Desu nôto (2006)", 8.9));
        tvShowTree.addNode(new TvShow(32, "Ramayan (1987)", 8.9));
        tvShowTree.addNode(new TvShow(33, "Apocalypse: La 2ème guerre mondiale (2009)", 8.9));
        tvShowTree.addNode(new TvShow(34, "Fargo (2014)", 8.9));
        tvShowTree.addNode(new TvShow(35, "Kaubôi bibappu (1998)", 8.9));
        tvShowTree.addNode(new TvShow(36, "Africa (2013)", 8.9));
        tvShowTree.addNode(new TvShow(37, "When They See Us (2019)", 8.9));
        tvShowTree.addNode(new TvShow(38, "Last Week Tonight with John Oliver (2014)", 8.9));
        tvShowTree.addNode(new TvShow(39, "TVF Pitchers (2015)", 8.8));
        tvShowTree.addNode(new TvShow(40, "Only Fools and Horses (1981)", 8.8));
        tvShowTree.addNode(new TvShow(41, "Hunter x Hunter (2011)", 8.8));
        tvShowTree.addNode(new TvShow(42, "Friends (1994)", 8.8));
        tvShowTree.addNode(new TvShow(43, "The Office (2005)", 8.8));
        tvShowTree.addNode(new TvShow(44, "Monty Python's Flying Circus (1969)", 8.8));
        tvShowTree.addNode(new TvShow(45, "Das Boot (1985)", 8.8));
        tvShowTree.addNode(new TvShow(46, "Seinfeld (1989)", 8.8));
        tvShowTree.addNode(new TvShow(47, "Pride and Prejudice (1995)", 8.8));
        tvShowTree.addNode(new TvShow(48, "Gravity Falls (2012)", 8.8));
        tvShowTree.addNode(new TvShow(49, "Black Mirror (2011)", 8.8));
        tvShowTree.addNode(new TvShow(50, "Twin Peaks (1990)", 8.8));
        tvShowTree.addNode(new TvShow(51, "Over the Garden Wall (2014)", 8.8));
        tvShowTree.addNode(new TvShow(52, "One Punch Man: Wanpanman (2015)", 8.8));
        tvShowTree.addNode(new TvShow(53, "Nathan for You (2013)", 8.8));
        tvShowTree.addNode(new TvShow(54, "Narcos (2015)", 8.8));
        tvShowTree.addNode(new TvShow(55, "Peaky Blinders (2013)", 8.8));
        tvShowTree.addNode(new TvShow(56, "Blackadder Goes Forth (1989)", 8.7));
        tvShowTree.addNode(new TvShow(57, "Voll daneben voll im Leben (1999)", 8.7));
        tvShowTree.addNode(new TvShow(58, "Stranger Things (2016)", 8.7));
        tvShowTree.addNode(new TvShow(59, "Vratice se rode (2007)", 8.7));
        tvShowTree.addNode(new TvShow(60, "Senke nad Balkanom (2017)", 8.7));
        tvShowTree.addNode(new TvShow(61, "Fawlty Towers (1975)", 8.7));
        tvShowTree.addNode(new TvShow(62, "Arrested Development (2003)", 8.7));
        tvShowTree.addNode(new TvShow(63, "Shingeki no kyojin (2013)", 8.7));
        tvShowTree.addNode(new TvShow(64, "Chappelle's Show (2003)", 8.7));
        tvShowTree.addNode(new TvShow(65, "It's Always Sunny in Philadelphia (2005)", 8.7));
        tvShowTree.addNode(new TvShow(66, "Rome (2005)", 8.7));
        tvShowTree.addNode(new TvShow(67, "House of Cards (2013)", 8.7));
        tvShowTree.addNode(new TvShow(68, "Dragon Ball Z: Doragon bôru zetto (1989)", 8.7));
        tvShowTree.addNode(new TvShow(69, "Kota Factory (2019)", 8.7));
        tvShowTree.addNode(new TvShow(70, "Oz (1997)", 8.7));
        tvShowTree.addNode(new TvShow(71, "The West Wing (1999)", 8.7));
        tvShowTree.addNode(new TvShow(72, "Steins;Gate (2011)", 8.7));
        tvShowTree.addNode(new TvShow(73, "Leyla ile Mecnun (2011)", 8.7));
        tvShowTree.addNode(new TvShow(74, "Dragon Ball Z (1996)", 8.7));
        tvShowTree.addNode(new TvShow(75, "Vinland Saga (2019)", 8.7));
        tvShowTree.addNode(new TvShow(76, "Cobra Kai (2018)", 8.7));
        tvShowTree.addNode(new TvShow(77, "Mahabharat (1988)", 8.7));
        tvShowTree.addNode(new TvShow(78, "Westworld (2016)", 8.7));
        tvShowTree.addNode(new TvShow(79, "One Strange Rock (2018)", 8.7));
        tvShowTree.addNode(new TvShow(80, "Ich, Claudius, Kaiser und Gott (1976)", 8.7));
        tvShowTree.addNode(new TvShow(81, "The Marvelous Mrs. Maisel (2017)", 8.7));
        tvShowTree.addNode(new TvShow(82, "The Boys (2019)", 8.7));
        tvShowTree.addNode(new TvShow(83, "Dark (2017)", 8.7));
        tvShowTree.addNode(new TvShow(84, "Curb Your Enthusiasm (2000)", 8.7));
        tvShowTree.addNode(new TvShow(85, "Fleabag (2016)", 8.7));
        tvShowTree.addNode(new TvShow(86, "Content Cop (2015)", 8.7));
        tvShowTree.addNode(new TvShow(87, "The Mandalorian (2019)", 8.7));
        tvShowTree.addNode(new TvShow(88, "Sarabhai vs Sarabhai (2004)", 8.7));
        tvShowTree.addNode(new TvShow(89, "The Jinx: The Life and Deaths of Robert Durst (2015)", 8.7));
        tvShowTree.addNode(new TvShow(90, "The Adventures of Sherlock Holmes (1984)", 8.7));
        tvShowTree.addNode(new TvShow(91, "Better Call Saul (2015)", 8.7));
        tvShowTree.addNode(new TvShow(92, "Justice League Unlimited (2004)", 8.7));
        tvShowTree.addNode(new TvShow(93, "The Thick of It (2005)", 8.7));
        tvShowTree.addNode(new TvShow(94, "Six Feet Under (2001)", 8.7));
        tvShowTree.addNode(new TvShow(95, "South Park (1997)", 8.6));
        tvShowTree.addNode(new TvShow(96, "Meme Review (2017)", 8.6));
        tvShowTree.addNode(new TvShow(97, "BoJack Horseman (2014)", 8.6));
        tvShowTree.addNode(new TvShow(98, "The Simpsons (1989)", 8.6));
        tvShowTree.addNode(new TvShow(99, "Demon Slayer: Kimetsu No Yaiba (2019)", 8.6));
        tvShowTree.addNode(new TvShow(100, "Pew News (2018)", 8.6));
        tvShowTree.addNode(new TvShow(101, "House MD (2004)", 8.6));
        tvShowTree.addNode(new TvShow(102, "Yakusoku no Neverland (2019)", 8.6));
        tvShowTree.addNode(new TvShow(103, "Critical Role (2015)", 8.6));
        tvShowTree.addNode(new TvShow(104, "The Return of Sherlock Holmes (1986)", 8.6));
        tvShowTree.addNode(new TvShow(105, "The Crown (2016)", 8.6));
        tvShowTree.addNode(new TvShow(106, "Battlestar Galactica (2004)", 8.6));
        tvShowTree.addNode(new TvShow(107, "Aranyélet (2015)", 8.6));
        tvShowTree.addNode(new TvShow(108, "One Piece: Wan pîsu (1999)", 8.6));
        tvShowTree.addNode(new TvShow(109, "Top Gear (2002)", 8.6));
        tvShowTree.addNode(new TvShow(110, "The Shield (2002)", 8.6));
        tvShowTree.addNode(new TvShow(111, "The Haunting of Hill House (2018)", 8.6));
        tvShowTree.addNode(new TvShow(112, "This Is Us (2016)", 8.6));
        tvShowTree.addNode(new TvShow(113, "Deadwood (2004)", 8.6));
        tvShowTree.addNode(new TvShow(114, "The Grand Tour (2016)", 8.6));
        tvShowTree.addNode(new TvShow(115, "Downton Abbey (2010)", 8.6));
        tvShowTree.addNode(new TvShow(116, "Weg in die Wildnis (1989)", 8.6));
        tvShowTree.addNode(new TvShow(117, "Kenpû Denki Berserk (1997)", 8.6));
        tvShowTree.addNode(new TvShow(118, "Blackadder II (1986)", 8.6));
        tvShowTree.addNode(new TvShow(119, "Bron/Broen (2011)", 8.6));
        tvShowTree.addNode(new TvShow(120, "Akte X - Die unheimlichen Fälle des FBI (1993)", 8.6));
        tvShowTree.addNode(new TvShow(121, "Star Trek: The Next Generation (1987)", 8.6));
        tvShowTree.addNode(new TvShow(122, "Parks and Recreation (2009)", 8.6));
        tvShowTree.addNode(new TvShow(123, "The Memoirs of Sherlock Holmes (1994)", 8.6));
        tvShowTree.addNode(new TvShow(124, "Archer (2009)", 8.6));
        tvShowTree.addNode(new TvShow(125, "Battlestar Galactica (2003)", 8.6));
        tvShowTree.addNode(new TvShow(126, "Atlanta (2016)", 8.6));
        tvShowTree.addNode(new TvShow(127, "Line of Duty (2012)", 8.6));
        tvShowTree.addNode(new TvShow(128, "Friday Night Lights (2006)", 8.6));
        tvShowTree.addNode(new TvShow(129, "Kôdo giasu - Hangyaku no rurûshu: Code Geass - Lelouch of the Rebellion (2006)", 8.6));
        tvShowTree.addNode(new TvShow(130, "Young Justice (2010)", 8.6));
        tvShowTree.addNode(new TvShow(131, "Gomorra: La serie (2014)", 8.6));
        tvShowTree.addNode(new TvShow(132, "Dexter (2006)", 8.6));
        tvShowTree.addNode(new TvShow(133, "Rurouni Kenshin: Meiji Kenkaku Romantan: Tsuioku Hen (1999)", 8.6));
        tvShowTree.addNode(new TvShow(134, "Blackadder the Third (1987)", 8.6));
        tvShowTree.addNode(new TvShow(135, "Mad Men (2007)", 8.6));
        tvShowTree.addNode(new TvShow(136, "Daredevil (2015)", 8.6));
        tvShowTree.addNode(new TvShow(137, "QI (2003)", 8.6));
        tvShowTree.addNode(new TvShow(138, "Through the Wormhole (2010)", 8.6));
        tvShowTree.addNode(new TvShow(139, "Mindhunter (2017)", 8.6));
        tvShowTree.addNode(new TvShow(140, "The Bugs Bunny Show (1960)", 8.6));
        tvShowTree.addNode(new TvShow(141, "Making a Murderer (2015)", 8.6));
        tvShowTree.addNode(new TvShow(142, "Yeh Meri Family (2018)", 8.6));
        tvShowTree.addNode(new TvShow(143, "Long Way Round (2004)", 8.6));
        tvShowTree.addNode(new TvShow(144, "The Eric Andre Show (2012)", 8.6));
        tvShowTree.addNode(new TvShow(145, "Peep Show (2003)", 8.6));
        tvShowTree.addNode(new TvShow(146, "MisteRogers' Neighborhood (1968)", 8.6));
        tvShowTree.addNode(new TvShow(147, "North & South (2004)", 8.6));
        tvShowTree.addNode(new TvShow(148, "Father Ted (1995)", 8.6));
        tvShowTree.addNode(new TvShow(149, "Mind Your Language (1977)", 8.5));
        tvShowTree.addNode(new TvShow(150, "Sacred Games (2018)", 8.5));
        tvShowTree.addNode(new TvShow(151, "Formula 1: Drive to Survive (2019)", 8.5));
        tvShowTree.addNode(new TvShow(152, "Panchayat (2020)", 8.5));
        tvShowTree.addNode(new TvShow(153, "The Newsroom (2012)", 8.5));
        tvShowTree.addNode(new TvShow(154, "Spaced (1999)", 8.5));
        tvShowTree.addNode(new TvShow(155, "Yes Minister (1980)", 8.5));
        tvShowTree.addNode(new TvShow(156, "Monster (2004)", 8.5));
        tvShowTree.addNode(new TvShow(157, "Umbre (2014)", 8.5));
        tvShowTree.addNode(new TvShow(158, "Satyamev Jayate (2012)", 8.5));
        tvShowTree.addNode(new TvShow(159, "Skam (2015)", 8.5));
        tvShowTree.addNode(new TvShow(160, "Brass Eye (1997)", 8.5));
        tvShowTree.addNode(new TvShow(161, "El Chavo del Ocho (1972)", 8.5));
        tvShowTree.addNode(new TvShow(162, "Behzat Ç:Bir Ankara Polisiyesi (2010)", 8.5));
        tvShowTree.addNode(new TvShow(163, "Poirot (1989)", 8.5));
        tvShowTree.addNode(new TvShow(164, "Hagane no renkinjutsushi (2003)", 8.5));
        tvShowTree.addNode(new TvShow(165, "Justified (2010)", 8.5));
        tvShowTree.addNode(new TvShow(166, "Shameless (2011)", 8.5));
        tvShowTree.addNode(new TvShow(167, "From the Earth to the Moon (1998)", 8.5));
        tvShowTree.addNode(new TvShow(168, "Dragon Ball: Doragon bôru (1986)", 8.5));
        tvShowTree.addNode(new TvShow(169, "Love, Death & Robots (2019)", 8.5));
        tvShowTree.addNode(new TvShow(170, "Doctor Who (2005)", 8.5));
        tvShowTree.addNode(new TvShow(171, "Justice League (2001)", 8.5));
        tvShowTree.addNode(new TvShow(172, "Shin Seiki Evangelion (1995)", 8.5));
        tvShowTree.addNode(new TvShow(173, "Adventure Time with Finn & Jake (2010)", 8.5));
        tvShowTree.addNode(new TvShow(174, "Boardwalk Empire (2010)", 8.5));
        tvShowTree.addNode(new TvShow(175, "The Untold History of the United States (2012)", 8.5));
        tvShowTree.addNode(new TvShow(176, "The Bugs Bunny/Road Runner Hour (1968)", 8.5));
        tvShowTree.addNode(new TvShow(177, "Dragon Ball (1995)", 8.5));
        tvShowTree.addNode(new TvShow(178, "Samurai chanpurû (2004)", 8.5));
        tvShowTree.addNode(new TvShow(179, "Chef's Table (2015)", 8.5));
        tvShowTree.addNode(new TvShow(180, "Haikyuu!! (2014)", 8.5));
        tvShowTree.addNode(new TvShow(181, "Flight of the Conchords (2007)", 8.5));
        tvShowTree.addNode(new TvShow(182, "Yes, Prime Minister (1986)", 8.5));
        tvShowTree.addNode(new TvShow(183, "Anne (2017)", 8.5));
        tvShowTree.addNode(new TvShow(184, "Mystery Science Theater 3000 (1988)", 8.5));
        tvShowTree.addNode(new TvShow(185, "Twin Peaks (2017)", 8.5));
        tvShowTree.addNode(new TvShow(186, "The Defiant Ones (2017)", 8.5));
        tvShowTree.addNode(new TvShow(187, "Generation Kill (2008)", 8.5));
        tvShowTree.addNode(new TvShow(188, "GTO (1999)", 8.5));
        tvShowTree.addNode(new TvShow(189, "The IT Crowd (2006)", 8.5));
        tvShowTree.addNode(new TvShow(190, "Coupling (2000)", 8.5));
        tvShowTree.addNode(new TvShow(191, "Louie (2010)", 8.5));
        tvShowTree.addNode(new TvShow(192, "Mr. Bean (1990)", 8.5));
        tvShowTree.addNode(new TvShow(193, "The Night Of (2016)", 8.5));
        tvShowTree.addNode(new TvShow(194, "Big Little Lies (2017)", 8.5));
        tvShowTree.addNode(new TvShow(195, "Impractical Jokers (2011)", 8.5));
        tvShowTree.addNode(new TvShow(196, "Alfred Hitchcock präsentiert (1955)", 8.5));
        tvShowTree.addNode(new TvShow(197, "Silicon Valley (2014)", 8.5));
        tvShowTree.addNode(new TvShow(198, "Mr. Robot (2015)", 8.5));
        tvShowTree.addNode(new TvShow(199, "Endeavour (2012)", 8.5));
        tvShowTree.addNode(new TvShow(200, "Letterkenny (2016)", 8.5));
        tvShowTree.addNode(new TvShow(201, "Whose Line Is It Anyway? (1998)", 8.5));
        tvShowTree.addNode(new TvShow(202, "Detectorists (2014)", 8.5));
        tvShowTree.addNode(new TvShow(203, "Homicide: Life on the Street (1993)", 8.5));
        tvShowTree.addNode(new TvShow(204, "Spartacus: Gods of the Arena (2011)", 8.5));
        tvShowTree.addNode(new TvShow(205, "Horace and Pete (2016)", 8.5));
        tvShowTree.addNode(new TvShow(206, "Hannibal (2013)", 8.5));
        tvShowTree.addNode(new TvShow(207, "The Punisher (2017)", 8.5));
        tvShowTree.addNode(new TvShow(208, "The Office (2001)", 8.5));
        tvShowTree.addNode(new TvShow(209, "John Adams (2008)", 8.5));
        tvShowTree.addNode(new TvShow(210, "Black Books (2000)", 8.5));
        tvShowTree.addNode(new TvShow(211, "I'm Alan Partridge (1997)", 8.5));
        tvShowTree.addNode(new TvShow(212, "Sons of Anarchy (2008)", 8.5));
        tvShowTree.addNode(new TvShow(213, "The Family Man (2019)", 8.5));
        tvShowTree.addNode(new TvShow(214, "Queer Eye (2018)", 8.5));
        tvShowTree.addNode(new TvShow(215, "The New Batman Adventures (1997)", 8.5));
        tvShowTree.addNode(new TvShow(216, "Vikings (2013)", 8.5));
        tvShowTree.addNode(new TvShow(217, "Boku dake ga inai machi (2016)", 8.5));
        tvShowTree.addNode(new TvShow(218, "Dr. Horrible's Sing-Along Blog (2008)", 8.5));
        tvShowTree.addNode(new TvShow(219, "Naruto: Shippûden (2007)", 8.5));
        tvShowTree.addNode(new TvShow(220, "Pose (2018)", 8.5));
        tvShowTree.addNode(new TvShow(221, "Shigatsu wa kimi no uso (2014)", 8.5));
        tvShowTree.addNode(new TvShow(222, "Spartacus: Blood and Sand (2010)", 8.5));
        tvShowTree.addNode(new TvShow(223, "Boku no hîrô akademia (2016)", 8.5));
        tvShowTree.addNode(new TvShow(224, "Luther (2010)", 8.4));
        tvShowTree.addNode(new TvShow(225, "Feud (2017)", 8.4));
        tvShowTree.addNode(new TvShow(226, "The Dark Crystal: Age of Resistance (2019)", 8.4));
        tvShowTree.addNode(new TvShow(227, "Gintama (2005)", 8.4));
        tvShowTree.addNode(new TvShow(228, "The Knick (2014)", 8.4));
        tvShowTree.addNode(new TvShow(229, "Community (2009)", 8.4));
        tvShowTree.addNode(new TvShow(230, "The Venture Bros. (2003)", 8.4));
        tvShowTree.addNode(new TvShow(231, "Clannad: After Story (2008)", 8.4));
        tvShowTree.addNode(new TvShow(232, "Mob Psycho 100 (2016)", 8.4));
        tvShowTree.addNode(new TvShow(233, "Kôkaku kidôtai: Stand Alone Complex (2002)", 8.4));
        tvShowTree.addNode(new TvShow(234, "Rurôni Kenshin - Meiji kenkaku romantan (1996)", 8.4));
        tvShowTree.addNode(new TvShow(235, "Wentworth (2013)", 8.4));
        tvShowTree.addNode(new TvShow(236, "Samurai Jack (2001)", 8.4));
        tvShowTree.addNode(new TvShow(237, "Check It Out! with Dr. Steve Brule (2010)", 8.4));
        tvShowTree.addNode(new TvShow(238, "Unsere Mütter, unsere Väter (2013)", 8.4));
        tvShowTree.addNode(new TvShow(239, "Sseulsseulhago Chalranhashin: Dokkaebi (2016)", 8.4));
        tvShowTree.addNode(new TvShow(240, "Der Tatortreiniger (2011)", 8.4));
        tvShowTree.addNode(new TvShow(241, "The Chosen (2017)", 8.4));
        tvShowTree.addNode(new TvShow(242, "Mushishi (2005)", 8.4));
        tvShowTree.addNode(new TvShow(243, "Inside No. 9 (2014)", 8.4));
        tvShowTree.addNode(new TvShow(244, "Ezel (2009)", 8.4));
        tvShowTree.addNode(new TvShow(245, "Succession (2018)", 8.4));
        tvShowTree.addNode(new TvShow(246, "This Is England '90 (2015)", 8.4));
        tvShowTree.addNode(new TvShow(247, "X-Men (1992)", 8.4));
        tvShowTree.addNode(new TvShow(248, "Futurama (1999)", 8.4));
        tvShowTree.addNode(new TvShow(249, "Jesus of Nazareth (1977)", 8.4));
        tvShowTree.addNode(new TvShow(250, "Delhi Crime (2019)", 8.4));
    }
}

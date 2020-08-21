package oi222ay_assign3.ex7;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class NorseGodMain extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage norse) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<NorseGod> gods = new ArrayList<NorseGod>();
		NorseGod Odin = new NorseGod("Odin", "Aesir", "");
		Odin.setDesc("Odin (/ˈoʊdɪn/;[1] from Old Norse: Óðinn, IPA: [ˈoːðinː]) is a widely revered god in Germanic mythology. Norse mythology, the source of most surviving information about him, associates Odin with wisdom, healing, death, royalty, the gallows, knowledge, war, battle, victory, sorcery, poetry, frenzy, and the runic alphabet, and portrays him as the husband of the goddess Frigg. In wider Germanic mythology and paganism, the god was known in Old English as Wōden, in Old Saxon as Wōdan, in Old Dutch as Wuodan[2]and in Old High German as Wuotan.\n" + 
				"\n" + "Odin appears as a prominent god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania (from c.  12 BCE) through the tribal expansions of the Migration Period (4th to 6th centuries CE) and the Viking Age (8th to 11th centuries CE). In the modern period the rural folklore of Germanic Europe continued to acknowledge Odin. References to him appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including in English.\n" + 
				"\n" + "In Old English texts, Odin holds a particular place as a euhemerized ancestral figure among royalty, and he is frequently referred to as a founding figure among various other Germanic peoples, such as the Langobards. Forms of his name appear frequently throughout the Germanic record, though narratives regarding Odin are mainly found in Old Norse works recorded in Iceland, primarily around the 13th century. These texts make up the bulk of modern understanding of Norse mythology.\n" + 
				"\n" + "Old Norse texts portray Odin as one-eyed and long-bearded, frequently wielding a spear named Gungnir and wearing a cloak and a broad hat. He is often accompanied by his animal companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé. Odin is attested as having many sons, most famously the gods Thor (with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts he frequently seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), makes wagers with his wife Frigg over the outcome of exploits, and takes part both in the creation of the world by way of slaying the primordial being Ymir and in giving the gift of life to the first two humans Ask and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes and poetry is also attributed to him, giving Odin aspects of the culture hero.");
		NorseGod Thor = new NorseGod("Thor", "Aesir", "");
		Thor.setDesc("In Germanic mythology, Thor (/θɔːr/; from Old Norse: Þórr, runic ᚦᚢᚱ þur) is a hammer-wielding god associated with thunder, lightning, storms, sacred groves and trees, strength, the protection of mankind and also hallowing and fertility. Besides Old Norse Þórr, extensions of the god occur in Old English as Þunor and in Old High German as Donar (runic ᚦᛟᚾᚨᚱ þonar). All forms of the deity stem from a Common Germanic *Þunraz (meaning thunder).\n" + 
				"\n" + "Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\n" + 
				"\n" + "Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[1] With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology.\n" + 
				"\n" + "Into the modern period, Thor continued to be acknowledged in rural folklore throughout Germanic-speaking Europe. Thor is frequently referred to in place names, the day of the week Thursday bears his name (modern English Thursday derives from Old English Þūnresdæg, 'Þunor's day'), and names stemming from the pagan period containing his own continue to be used today, particularly in Scandinavia. Thor has inspired numerous works of art and references to Thor appear in modern popular culture. Like other Germanic deities, veneration of Thor is revived in the modern period in Heathenry.");
		NorseGod Loki = new NorseGod("Loki", "Frost Giant", "");
		Loki.setDesc("Loki (Old Norse: [ˈloki], Modern Icelandic: [ˈlɔːkɪ], often Anglicized as /ˈloʊki/) is a god in Norse mythology. Loki is in some sources the son of Fárbauti and Laufey, and the brother of Helblindi and Býleistr. By the jötunn Angrboða, Loki is the father of Hel, the wolf Fenrir, and the world serpent Jörmungandr. By his wife Sigyn, Loki is the father of Narfi and/or Nari. By the stallion Svaðilfari, Loki is the mother—giving birth in the form of a mare—to the eight-legged horse Sleipnir. In addition, Loki is referred to as the father of Váli in Prose Edda, though this source also refers to Odin as the father of Váli twice, and Váli is found mentioned as a Son of Loki only once.\n" + 
				"\n" + "Loki's relation with the gods varies by source; Loki sometimes assists the gods and sometimes behaves in a malicious manner towards them. Loki is a shape shifter and in separate incidents he appears in the form of a salmon, a mare, a fly, and possibly an elderly woman named Þökk (Old Norse 'thanks'). Loki's positive relations with the gods end with his role in engineering the death of the god Baldr and Loki is eventually bound by Váli with the entrails of one of his sons. In both the Poetic Edda and the Prose Edda, the goddess Skaði is responsible for placing a serpent above him while he is bound. The serpent drips venom from above him that Sigyn collects into a bowl; however, she must empty the bowl when it is full, and the venom that drips in the meantime causes Loki to writhe in pain, thereby causing earthquakes. With the onset of Ragnarök, Loki is foretold to slip free from his bonds and to fight against the gods among the forces of the jötnar, at which time he will encounter the god Heimdallr and the two will slay each other.\n" + 
				"\n" + "Loki is referred to in the Poetic Edda, compiled in the 13th century from earlier traditional sources; the Prose Edda and Heimskringla, written in the 13th century by Snorri Sturluson; the Norwegian Rune Poems, in the poetry of skalds, and in Scandinavian folklore. Loki may be depicted on the Snaptun Stone, the Kirkby Stephen Stone, and the Gosforth Cross. Loki's origins and role in Norse mythology, which some scholars have described as that of a trickster god, have been much debated by scholars. Loki has been depicted in or is referenced in a variety of media in modern popular culture.");
		NorseGod Baldr = new NorseGod("Baldr", "Aesir", "");
		Baldr.setDesc("Baldr (also Balder, Baldur) is a god in Norse mythology and a son of the god Odin and the goddess Frigg. He has numerous brothers, such as Thor and Váli.\n" + 
				"\n" + "During the 12th century, Danish accounts by Saxo Grammaticus and other Danish Latin chroniclers recorded a euhemerized account of his story. Compiled in Iceland during the 13th century, but based on much older Old Norse poetry, the Poetic Edda and the Prose Edda contain numerous references to the death of Baldr as both a great tragedy to the Æsir and a harbinger of Ragnarök.\n" + 
				"\n" + "According to Gylfaginning, a book of Snorri Sturluson's Prose Edda, Baldr's wife is Nanna and their son is Forseti. Baldr had the greatest ship ever built, Hringhorni, and there is no place more beautiful than his hall, Breidablik.");
		NorseGod Freyr = new NorseGod("Freyr", "Vanir", "");
		Freyr.setDesc("Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god in Norse mythology, associated with sacral kingship, battle, virility, peace and prosperity, with sunshine and fair weather, and with good harvest. Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house. According to Adam of Bremen, Freyr was associated with peace and pleasure, and was represented with a phallic statue in the Temple at Uppsala. According to Snorri Sturluson, Freyr was \"the most renowned of the æsir\", and was venerated for good harvest and peace.\n" + 
				"\n" + "In the mythological stories in the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr, or Njord, as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present. He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze and can be folded together and carried in a pouch when it is not being used. Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Thrandheim in Norway.[1] He has the servants Skírnir, Byggvir and Beyla.\n" + 
				"\n" + "The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr. Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\" Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler. However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök.\n" + 
				"\n" + "Like other Germanic deities, veneration of Freyr is revived during the modern period through the Heathenry movement.");
		NorseGod Freyja = new NorseGod("Freyja", "Vanir", "");
		Freyja.setDesc("In Norse mythology, Freyja (/ˈfreɪə/; Old Norse for \"(the) Lady\") is a goddess associated love, beauty, fertility, gold, and seiðr. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\n" + 
				"\n" + "Freyja rules over her heavenly field, Fólkvangr, where she receives half of those who die in battle. The other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís.\n" + 
				"\n" + "Freyja is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; in the Prose Edda and Heimskringla, composed by Snorri Sturluson in the 13th century; in several Sagas of Icelanders; in the short story \"Sörla þáttr\"; in the poetry of skalds; and into the modern age in Scandinavian folklore.\n" + 
				"\n" + "Scholars have debated whether Freyja and the goddess Frigg ultimately stem from a single goddess common among the Germanic peoples; connected her to the valkyries, female battlefield choosers of the slain; and analyzed her relation to other goddesses and figures in Germanic mythology, including the thrice-burnt and thrice-reborn Gullveig/Heiðr, the goddesses Gefjon, Skaði, Þorgerðr Hölgabrúðr and Irpa, Menglöð, and the 1st century CE \"Isis\" of the Suebi. Freyja's name appears in numerous place names in Scandinavia, with a high concentration in southern Sweden. Various plants in Scandinavia once bore her name, but it was replaced with the name of the Virgin Mary during the process of Christianization. Rural Scandinavians continued to acknowledge Freyja as a supernatural figure into the 19th century, and Freyja has inspired various works of art.");
		NorseGod Heimdallr = new NorseGod("Heimdallr", "Aesir", "");
		Heimdallr.setDesc("In Norse mythology, Heimdallr is a god who possesses the resounding horn Gjallarhorn, owns the golden-maned horse Gulltoppr, is called the shining god and the whitest of the gods, has gold teeth, and is the son of Nine Mothers (who may represent personified waves). Heimdallr is attested as possessing foreknowledge, keen eyesight and hearing, and keeps watch for invaders and the onset of Ragnarök while drinking fine mead in his dwelling Himinbjörg, located where the burning rainbow bridge Bifröst meets the sky. Heimdallr is said to be the originator of social classes among humanity and once regained Freyja's treasured possession Brísingamen while doing battle in the shape of a seal with Loki. Heimdallr and Loki are foretold to kill one another during the events of Ragnarök. Heimdallr is additionally referred to as Rig, Hallinskiði, Gullintanni, and Vindlér or Vindhlér.\n" + 
				"\n" + "Heimdallr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional material; in the Prose Edda and Heimskringla, both written in the 13th century by Snorri Sturluson; in the poetry of skalds; and on an Old Norse runic inscription found in England. Two lines of an otherwise lost poem about the god, Heimdalargaldr, survive. Due to the problematic and enigmatic nature of these attestations, scholars have produced various theories about the nature of the god, including his apparent relation to rams, that he may be a personification of or connected to the world tree Yggdrasil, and potential Indo-European cognates.");
		NorseGod Bragi = new NorseGod("Bragi", "Aesir", "");
		Bragi.setDesc("Bragi is generally associated with bragr, the Norse word for poetry. The name of the god may have been derived from bragr, or the term bragr may have been formed to describe 'what Bragi does'. A connection between the name Bragi and Old English brego 'chieftain' has been suggested but is generally now discounted. A connection between Bragi and the bragarfull 'promise cup' is sometimes suggested, as bragafull, an alternate form of the word, might be translated as 'Bragi's cup'. See Bragarfull.");
		NorseGod Tyr = new NorseGod("Tyr", "Aesir", "");
		Tyr.setDesc("Týr (Old Norse), Tíw (Old English), and Ziu (Old High German) is a god in Germanic mythology. Stemming from the Proto-Germanic deity *Tīwaz and ultimately from the Proto-Indo-European chief deity *Dyeus, little information about the god survives beyond Old Norse sources. Due to the etymology of the god's name and the shadowy presence of the god in the extant Germanic corpus, some scholars propose that Týr may have once held a more central place among the deities of early Germanic mythology.\n" + 
				"\n" + "Týr is the namesake of the Tiwaz rune (ᛏ), a letter of the runic alphabet corresponding to the Latin letter T. By way of the process of interpretatio germanica, the deity is the namesake of Tuesday ('Týr's day') in Germanic languages, including English. Interpretatio romana, in which Romans interpreted other gods as forms of their own, generally renders the god as Mars, the ancient Roman war god, and it is through that lens that most Latin references to the god occur. For example, the god may be referenced as Mars Thingsus (Latin 'Mars of the Thing') on 3rd century Latin inscription, reflecting a strong association with the Germanic thing, a legislative body among the ancient Germanic peoples.\n" + 
				"\n" + "In Norse mythology, from which most surviving narratives about gods among the Germanic peoples stem, Týr sacrifices his arm to the monstrous wolf Fenrir, who bites off his limb while the gods bind the animal. Týr is foretold to be consumed by the similarly monstrous dog Garmr during the events of Ragnarök. In Old Norse sources, Týr is alternately described as the son of the jötunn Hymir (in Hymiskviða) or of the god Odin (in Skáldskaparmál). Lokasenna makes reference to an unnamed otherwise unknown consort, perhaps also reflected in the continental Germanic record (see Zisa (goddess)).\n" + 
				"\n" + "Various place names in Scandinavia refer to the god, and a variety of objects found in England and Scandinavia may depict the god or invoke him.");
		gods.add(Odin);
		gods.add(Thor);
		gods.add(Loki);
		gods.add(Baldr);
		gods.add(Freyr);
		gods.add(Freyja);
		gods.add(Heimdallr);
		gods.add(Bragi);
		gods.add(Tyr);
		
		ListView<String> godList = new ListView<String>();
		godList.setPrefWidth(150);
		godList.getItems().addAll(Odin.toString(), Thor.toString(),
				Loki.toString(), Baldr.toString(), Freyr.toString(),
				Freyja.toString(), Heimdallr.toString(), Bragi.toString(),
				Tyr.toString());
		
		BorderPane bp = new BorderPane();
		bp.setLeft(godList);
		Text bpTitle = new Text("NorseGods and other Beings");
		bpTitle.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		bp.setTop(bpTitle);
		TextFlow desc = new TextFlow();
		Text name = new Text();
		name.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
		Text race = new Text();
		Text description = new Text();
		
		desc.getChildren().addAll(name,race,description);
		desc.setPrefHeight(500);
		desc.setPrefWidth(500);
		bp.setRight(desc);

		godList.getSelectionModel().selectedIndexProperty().addListener(ov ->{
			name.setText(gods.get(godList.getSelectionModel().getSelectedIndex()).toString());
			race.setText(gods.get(godList.getSelectionModel().getSelectedIndex()).raceToString());
			description.setText(gods.get(godList.getSelectionModel().getSelectedIndex()).descToString());
		});
		
		ScrollPane sp = new ScrollPane();
		sp.setContent(desc);
		bp.setCenter(sp);
		Scene scene = new Scene(bp);
		norse.setTitle("Norse Gods");
		norse.setScene(scene);
		norse.show();
		
	}

}

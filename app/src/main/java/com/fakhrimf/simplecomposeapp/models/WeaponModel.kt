package com.fakhrimf.simplecomposeapp.models

import android.os.Parcelable
import com.fakhrimf.simplecomposeapp.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class WeaponModel(
    val image: Int,
    val name: String,
    val year: Int,
    val origin: String,
    val desc: String,
) : Parcelable

val dummy = listOf<WeaponModel>(
    WeaponModel(R.drawable.akm, "AKM", 1959, "USSR", "The AKM (Russian: Автома́т Кала́шникова модернизи́рованный, tr. Avtomát Kalášnikova modernizírovannyj, lit. 'Kalashnikov's Automatic Rifle Modernised') is an assault rifle designed by Soviet small arms designer Mikhail Kalashnikov in 1959. It was developed as a replacement to the AK-47 introduced a decade prior."),
    WeaponModel(R.drawable.aug, "Steyr AUG", 1977, "Austria", "The Steyr AUG (German: Armee-Universal-Gewehr, lit. 'army universal rifle') is an Austrian bullpup assault rifle chambered for the 5.56×45mm NATO intermediate cartridge, designed in the 1960s by Steyr-Daimler-Puch, and now manufactured by Steyr Arms GmbH & Co KG."),
    WeaponModel(R.drawable.garand, "M1 Garand", 1940, "United States", "The M1 Garand or M1 rifle[nb 1] is a semi-automatic rifle that was the service rifle of the U.S. Army during World War II and the Korean War.\n" +
            "\n" +
            "The rifle is chambered for the .30-06 Springfield cartridge and is named after its Canadian-American designer, John Garand. It was the first standard-issue autoloading rifle for the United States."),
    WeaponModel(R.drawable.gewehr_98, "Gewehr 98", 1898, "German Empire", "The Gewehr 98 (abbreviated G98, Gew 98, or M98) is a German bolt-action rifle made by Mauser, firing cartridges from a five-round internal clip-loaded magazine. It was the German service rifle from 1898 to 1935, when it was replaced by the Karabiner 98k, a shorter weapon using the same basic design. The Gewehr 98 action, using a stripper clip loaded with the 7.92×57mm Mauser cartridge, successfully combined and improved several bolt-action engineering concepts which were soon adopted by many other countries, including the United Kingdom, United States, and Japan."),
    WeaponModel(R.drawable.luger, "Luger P08", 1898, "German Empire", "The Pistole Parabellum or Parabellum-Pistole (Pistol Parabellum), commonly known as just the Luger or Luger P08,[11] is a toggle-locked recoil-operated semi-automatic pistol. The Luger was produced in several models and by several nations from 1898 to 1949."),
    WeaponModel(R.drawable.m82barrett, "Barrett M82", 1989, "United States", "The Barrett M82 (standardized by the U.S. military as the M107) is a recoil-operated, semi-automatic anti-materiel rifle developed by the American company Barrett Firearms Manufacturing.\n" +
            "\n" +
            "Also called the Light Fifty (due to its chambering of the .50 BMG 12.7×99mm NATO cartridge)."),
    WeaponModel(R.drawable.mauser, "Mauser C96", 1896, "German Empire", "The Mauser C96 (Construktion 96)[10] is a semi-automatic pistol that was originally produced by German arms manufacturer Mauser from 1896 to 1937. Unlicensed copies of the gun were also manufactured in Spain and China in the first half of the 20th century."),
    WeaponModel(R.drawable.negev, "IWI Negev", 1997, "Israel", "The IWI Negev (also known as the Negev NG-5) is a 5.56×45mm NATO light machine gun developed by Israel Weapon Industries (IWI), formerly Israel Military Industries Ltd. (IMI).\n" +
            "\n" +
            "In 2012, IWI introduced the Negev NG-7 7.62×51mm NATO general-purpose machine gun and is used by the Israel Defense Forces (mainly in the infantry, combat engineer and special forces units). The NG stands for Next Generation."),
    WeaponModel(R.drawable.panzerschreck, "Panzerschreck", 1943, "Nazi Germany", "Panzerschreck (lit. \"tank fright\", \"tank's fright\" or \"tank's bane\") was the popular name for the Raketenpanzerbüchse 54 (\"Rocket Anti-armor Rifle Model 54\", abbreviated to RPzB 54), an 88 mm reusable anti-tank rocket launcher developed by Nazi Germany in World War II. Another earlier, official name was Ofenrohr (\"stove pipe\")."),
    WeaponModel(R.drawable.scout, "Steyr Scout", 1999, "Austria", "The Steyr Scout (German pronunciation: [ˈʃtaɪɐ]) is an Austrian bolt-action rifle manufactured by Steyr Mannlicher, and chambered primarily for 7.62 NATO (.308 Winchester), although other caliber options in 5.56 NATO (.223 Remington), .243 Winchester, 6.5 Creedmoor, .376 Steyr and 7mm-08 Remington are also offered commercially. It is intended to fill the role of a versatile, lightweight all-around rifle as specified in Jeff Cooper's scout rifle concept. Apart from the barrel and action, the gun is made primarily of polymers and is designed to be accurate to at least 800 m (870 yd)."),
)

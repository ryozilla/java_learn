package methods;

import static methods.KanaEnum.*;

enum KanaEnum {
    //五十音图 清音
    A, I, U, E, O,
    KA, KI, KU, KE, KO,
    SA, SHI, SU, SE, SO,
    TA, CHI, TSU, TE, TO,
    NA, NI, NU, NE, NO,
    HA, HI, HU, HE, HO,
    MA, MI, MU, ME, MO,
    YA, YU, YO,
    RA, RI, RU, RE, RO,
    WA, WO, NN,

    //浊音、半浊音
    GA, GI, GU, GE, GO,
    ZA, JI, ZU, ZE, ZO,
    DA, DI, DU, DE, DO,
    BA, BI, BU, BE, BO,
    PA, PI, PU, PE, PO,

    //拗音
    KYA, KYU, KYO,
    SYA, SYU, SYO,
    NYA, NYU, NYO,
    HYA, HYU, HYO,
    MYA, MYU, MYO,
    RYA, RYU, RYO,
    GYA, GYU, GYO,
    JA, JU, JO,
    BYA, BYU, BYO,
    PYA, PYU, PYO,
}

public class JapaneseTurn {
    public static String romajiToKatakana(String romaji, String regex) {
        String[] romajiArr = romaji.split(regex);
        StringBuilder sb = new StringBuilder();
        for (String str : romajiArr) {
            sb.append(enumToHiragana(romajiToEnum(str)));
        }
        return sb.toString();
    }

    private static KanaEnum romajiToEnum(String romaji) {
        return switch (romaji) {
            //a
            case "a" -> A;
            case "i" -> I;
            case "u" -> U;
            case "e" -> E;
            case "o" -> O;
            //ka
            case "ka" -> KA;
            case "ki" -> KI;
            case "ku" -> KU;
            case "ke" -> KE;
            case "ko" -> KO;
            //sa
            case "sa" -> SA;
            case "shi", "si" -> SHI;
            case "su" -> SU;
            case "se" -> SE;
            case "so" -> SO;
            //ta
            case "ta" -> TA;
            case "chi", "ti" -> CHI;
            case "tsu", "tu" -> TSU;
            case "te" -> TE;
            case "to" -> TO;
            //na
            case "na" -> NA;
            case "ni" -> NI;
            case "nu" -> NU;
            case "ne" -> NE;
            case "no" -> NO;
            //ha
            case "ha" -> HA;
            case "hi" -> HI;
            case "hu", "fu" -> HU;
            case "he" -> HE;
            case "ho" -> HO;
            //ma
            case "ma" -> MA;
            case "mi" -> MI;
            case "mu" -> MU;
            case "me" -> ME;
            case "mo" -> MO;
            //ya
            case "ya" -> YA;
            case "yu" -> YU;
            case "yo" -> YO;
            //ra
            case "ra" -> RA;
            case "ri" -> RI;
            case "ru" -> RU;
            case "re" -> RE;
            case "ro" -> RO;
            //wa
            case "wa" -> WA;
            case "wo" -> WO;
            case "n", "nn" -> NN;
            //ga
            case "ga" -> GA;
            case "gi" -> GI;
            case "gu" -> GU;
            case "ge" -> GE;
            case "go" -> GO;
            //za
            case "za" -> ZA;
            case "ji", "zi" -> JI;
            case "zu" -> ZU;
            case "ze" -> ZE;
            case "zo" -> ZO;
            //da
            case "da" -> DA;
            case "di" -> DI;
            case "du" -> DU;
            case "de" -> DE;
            case "do" -> DO;
            //ba
            case "ba" -> BA;
            case "bi" -> BI;
            case "bu" -> BU;
            case "be" -> BE;
            case "bo" -> BO;
            //pa
            case "pa" -> PA;
            case "pi" -> PI;
            case "pu" -> PU;
            case "pe" -> PE;
            case "po" -> PO;
            //kya
            case "kya" -> KYA;
            case "kyu" -> KYU;
            case "kyo" -> KYO;
            //sya
            case "sya" -> SYA;
            case "syu" -> SYU;
            case "syo" -> SYO;
            //nya
            case "nya" -> NYA;
            case "nyu" -> NYU;
            case "nyo" -> NYO;
            //hya
            case "hya" -> HYA;
            case "hyu" -> HYU;
            case "hyo" -> HYO;
            //mya
            case "mya" -> MYA;
            case "myu" -> MYU;
            case "myo" -> MYO;
            //rya
            case "rya" -> RYA;
            case "ryu" -> RYU;
            case "ryo" -> RYO;
            //gya
            case "gya" -> GYA;
            case "gyu" -> GYU;
            case "gyo" -> GYO;
            //ja
            case "ja" -> JA;
            case "ju" -> JU;
            case "jo" -> JO;
            //bya
            case "bya" -> BYA;
            case "byu" -> BYU;
            case "byo" -> BYO;
            //pya
            case "pya" -> PYA;
            case "pyu" -> PYU;
            case "pyo" -> PYO;
            default -> null;
        };
    }

    private static String enumToHiragana(KanaEnum kanaEnum) {
        return switch (kanaEnum) {
            //a
            case A -> "あ";
            case I -> "い";
            case U -> "う";
            case E -> "え";
            case O -> "お";
            //ka
            case KA -> "か";
            case KI -> "き";
            case KU -> "く";
            case KE -> "け";
            case KO -> "こ";
            //sa
            case SA -> "さ";
            case SHI -> "し";
            case SU -> "す";
            case SE -> "せ";
            case SO -> "そ";
            //ta
            case TA -> "た";
            case CHI -> "ち";
            case TSU -> "つ";
            case TE -> "て";
            case TO -> "と";
            //na
            case NA -> "な";
            case NI -> "に";
            case NU -> "ぬ";
            case NE -> "ね";
            case NO -> "の";
            //ha
            case HA -> "は";
            case HI -> "ひ";
            case HU -> "ふ";
            case HE -> "へ";
            case HO -> "ほ";
            //ma
            case MA -> "ま";
            case MI -> "み";
            case MU -> "む";
            case ME -> "め";
            case MO -> "も";
            //ya
            case YA -> "や";
            case YU -> "ゆ";
            case YO -> "よ";
            //ra
            case RA -> "ら";
            case RI -> "り";
            case RU -> "る";
            case RE -> "れ";
            case RO -> "ろ";
            //wa
            case WA -> "わ";
            case WO -> "を";
            case NN -> "ん";
            //ga
            case GA -> "が";
            case GI -> "ぎ";
            case GU -> "ぐ";
            case GE -> "げ";
            case GO -> "ご";
            //za
            case ZA -> "ざ";
            case JI -> "じ";
            case ZU -> "ず";
            case ZE -> "ぜ";
            case ZO -> "ぞ";
            //da
            case DA -> "だ";
            case DI -> "ぢ";
            case DU -> "づ";
            case DE -> "で";
            case DO -> "ど";
            //ba
            case BA -> "ば";
            case BI -> "び";
            case BU -> "ぶ";
            case BE -> "べ";
            case BO -> "ぼ";
            //pa
            case PA -> "ぱ";
            case PI -> "ぴ";
            case PU -> "ぷ";
            case PE -> "ぺ";
            case PO -> "ぽ";
            //kya
            case KYA -> "きゃ";
            case KYU -> "きゅ";
            case KYO -> "きょ";
            //sya
            case SYA -> "しゃ";
            case SYU -> "しゅ";
            case SYO -> "しょ";
            //nya
            case NYA -> "にゃ";
            case NYU -> "にゅ";
            case NYO -> "にぉ";
            //hya
            case HYA -> "ひゃ";
            case HYU -> "ひゅ";
            case HYO -> "ひょ";
            //mya
            case MYA -> "みゃ";
            case MYU -> "みゅ";
            case MYO -> "みょ";
            //rya
            case RYA -> "りゃ";
            case RYU -> "りゅ";
            case RYO -> "りょ";
            //gya
            case GYA -> "ぎゃ";
            case GYU -> "ぎゅ";
            case GYO -> "ぎょ";
            //ja
            case JA -> "じゃ";
            case JU -> "じゅ";
            case JO -> "じょ";
            //bya
            case BYA -> "びゃ";
            case BYU -> "びゅ";
            case BYO -> "びょ";
            //pya
            case PYA -> "ぴゃ";
            case PYU -> "ぴゅ";
            case PYO -> "ぴょ";
        };
    }
}

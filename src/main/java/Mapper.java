import com.mcserby.training.refactoring.InternationalValues;
import com.mcserby.training.refactoring.Locale;
import com.mcserby.training.refactoring.Translation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper {

    private static List<Translation> mapNames(List<InternationalValues> values) {
        String name = values.stream().map(iv -> iv.getDetail("Uk").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfUk = new Translation(Collections.singletonList(name), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getDetail("Nl").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getDetail("De").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getDetail("Fr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getDetail("Es").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getDetail("It").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getDetail("At").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getDetail("ChFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getDetail("ChDe").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getDetail("ChIt").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getDetail("BeFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getDetail("LuDe").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getDetail("CaEs").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getDetail("LuFr").getName()).distinct().collect(Collectors.joining(" "));
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }

    private static List<Translation> mapDescriptions(List<InternationalValues> values) {
        String description = values.stream().map(iv -> iv.getDetail("Uk").getDescription()).findFirst().orElse("");
        Translation psfUk = new Translation(Collections.singletonList(description), new Locale("en_uk"));
        String nameNl = values.stream().map(iv -> iv.getDetail("Nl").getDescription().substring(0, Math.min(iv.getDetail("Nl").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfNl = new Translation(Collections.singletonList(nameNl), new Locale("nl"));
        String nameDe = values.stream().map(iv -> iv.getDetail("De").getDescription().substring(0, Math.min(iv.getDetail("De").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfDe = new Translation(Collections.singletonList(nameDe), new Locale("de"));
        String nameFr = values.stream().map(iv -> iv.getDetail("Fr").getDescription().substring(0, Math.min(iv.getDetail("Fr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfFr = new Translation(Collections.singletonList(nameFr), new Locale("fr"));
        String nameEs = values.stream().map(iv -> iv.getDetail("Es").getDescription().substring(0, Math.min(iv.getDetail("Es").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfEs = new Translation(Collections.singletonList(nameEs), new Locale("es"));
        String nameIt = values.stream().map(iv -> iv.getDetail("It").getDescription().substring(0, Math.min(iv.getDetail("It").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfIt = new Translation(Collections.singletonList(nameIt), new Locale("it"));
        String nameAt = values.stream().map(iv -> iv.getDetail("At").getDescription().substring(0, Math.min(iv.getDetail("At").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfAt = new Translation(Collections.singletonList(nameAt), new Locale("at"));
        String nameChFr = values.stream().map(iv -> iv.getDetail("ChFr").getDescription().substring(0, Math.min(iv.getDetail("ChFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCh = new Translation(Collections.singletonList(nameChFr), new Locale("ch_fr"));
        String nameChDe = values.stream().map(iv -> iv.getDetail("ChDe").getDescription().substring(0, Math.min(iv.getDetail("ChDe").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChDe = new Translation(Collections.singletonList(nameChDe), new Locale("ch_de"));
        String nameChIt = values.stream().map(iv -> iv.getDetail("ChIt").getDescription().substring(0, Math.min(iv.getDetail("ChIt").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfChIt = new Translation(Collections.singletonList(nameChIt), new Locale("ch_it"));
        String nameBeFr = values.stream().map(iv -> iv.getDetail("BeFr").getDescription().substring(0, Math.min(iv.getDetail("BeFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfBeFr = new Translation(Collections.singletonList(nameBeFr), new Locale("be_fr"));
        String nameLuDe = values.stream().map(iv -> iv.getDetail("LuDe").getDescription().substring(0, Math.min(iv.getDetail("LuDe").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLu = new Translation(Collections.singletonList(nameLuDe), new Locale("lux_de"));
        String nameCaEs = values.stream().map(iv -> iv.getDetail("CaEs").getDescription().substring(0, Math.min(iv.getDetail("CaEs").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfCa = new Translation(Collections.singletonList(nameCaEs), new Locale("es_ca"));
        String nameLuFr = values.stream().map(iv -> iv.getDetail("LuFr").getDescription().substring(0, Math.min(iv.getDetail("LuFr").getDescription().length(), 253)).trim()).findFirst().orElse("<NONE>");
        Translation psfLuFr = new Translation(Collections.singletonList(nameLuFr), new Locale("lux_fr"));
        return Arrays.asList(psfUk, psfNl, psfDe, psfFr, psfEs, psfIt, psfAt, psfCh, psfChDe, psfChIt, psfBeFr, psfLu, psfCa, psfLuFr);
    }
}

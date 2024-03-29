package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.*;

import java.time.Month;

public class ResumeTestData {
    public static Resume createResume1(String uuid, String fullName) {
        Resume resume1 = new Resume(uuid, fullName);
        resume1.setContact(ContactType.PHONE, "555-55-55");
        resume1.setContact(ContactType.MAIL, "email@mail.com");

        resume1.setSection(SectionType.OBJECTIVE, new TextSection("Персональный тренер по фитнесу"));
        resume1.setSection(SectionType.PERSONAL, new TextSection(
                "Хopoшaя физичeckaя фopma, вынocливый, цeлeycтpemлeнный, cтpeccoycтoйчивый, тpyдoлюбивый"
        ));
        resume1.setSection(SectionType.ACHIEVEMENT, new ListSection(
                "Проведение соревнований пo силовым видам спорта",
                "Участие в подготовке чемпионов и призеров международных соревнований, кандидатов в мастера спорта, мастеров спорта",
                "проведение занятий по силовому шейпингу",
                "проведение групповых занятий по аэробике"
        ));
        resume1.setSection(SectionType.QUALIFICATIONS, new ListSection(
                "Fitness-pro» г. Санкт-Петербург",
                "Спортивная диетология» г. Москва",
                "Говорим свободно на английском» г. Москва"
        ));
        resume1.setSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("FITTERRA", "",
                                new Organization.Position(2015, Month.OCTOBER,
                                        "Trainer",
                                        "Work in fitness club"
                                )
                        )
                )
        );
        resume1.setSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Физкультурный техникум", "",
                                new Organization.Position(2010, Month.SEPTEMBER, 2013, Month.JUNE,
                                        "Преподаватель физкультуры", ""
                                )
                        )
                )
        );
        return resume1;
    }

    public static Resume createResume2(String uuid, String fullName) {
        Resume resume2 = new Resume(uuid, fullName);
        resume2.setContact(ContactType.PHONE, "999-98-78");
        resume2.setContact(ContactType.MAIL, "ivanov_p@gmail.com");

        resume2.setSection(SectionType.OBJECTIVE, new TextSection("Наладчик трубопрокатных станков"));
        resume2.setSection(SectionType.PERSONAL, new TextSection(
                "Коммуникабельный, ответственный, пунктуальный, внимательный"
        ));
        resume2.setSection(SectionType.ACHIEVEMENT, new ListSection(
                "Выполнение ремонтов и модернизации оборудования",
                "обеспечение технической эксплуатации, своевременной и качественной подготовки производства, ремонта и модернизации оборудования, его эффективности работы",
                "координация сотрудничества с контролирующими и инспектирующими органами"
        ));
        resume2.setSection(SectionType.QUALIFICATIONS, new ListSection(
                "MS Office",
                "MS Excel",
                "Scad SYSTEMS",
                "EPLAN"
        ));
        resume2.setSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("InterPIPE", "http://interpipe.biz/",
                                new Organization.Position(2011, Month.NOVEMBER, 2018, Month.OCTOBER,
                                        "Engineer",
                                        "Repair of mechanic equipment"
                                )
                        )
                )
        );
        resume2.setSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Саратовский Технический Университет", "http://STU.ru/",
                                new Organization.Position(2005, Month.SEPTEMBER, 2013, Month.JUNE,
                                        "Инженер технолог", ""
                                ),
                                new Organization.Position(2010, Month.AUGUST, 2013, Month.MAY,
                                        "Аспирантура", ""
                                )
                        )
                )
        );
        return resume2;
    }

    public static Resume createResume3(String uuid, String fullName) {
        Resume resume3 = new Resume(uuid, fullName);
        resume3.setContact(ContactType.PHONE, "654-00-48");
        resume3.setContact(ContactType.MAIL, "pavel.k@ya.ru");

        resume3.setSection(SectionType.OBJECTIVE, new TextSection("Инженер-сметчик"));
        resume3.setSection(SectionType.PERSONAL, new TextSection("Внимание к деталям, стрессоустойчивость"));
        resume3.setSection(SectionType.ACHIEVEMENT, new ListSection(
                "Ведение объектов строительства финансируемых из государственного бюджета",
                "Защита выполненных работ перед заказчиком",
                "Составление калькуляций"
        ));
        resume3.setSection(SectionType.QUALIFICATIONS, new ListSection(
                "Строительные технологии смета",
                "Смета ПИР",
                "Тендер-контракт интеллектуальные системы",
                "ГрандСмета РФ"
        ));
        resume3.setSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("DONBUDMONTAG", "",
                                new Organization.Position(2010, Month.DECEMBER, 2015, Month.MARCH,
                                        "Cost estimator",
                                        "Cost planning"
                                )
                        )
                )
        );
        resume3.setSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Томский Строительный Университет", "http://TSU.com/",
                                new Organization.Position(2003, Month.SEPTEMBER, 2008, Month.JUNE,
                                        "Инженер строитель", ""
                                )
                        )
                )
        );
        return resume3;
    }

    public static Resume createResume4(String uuid, String fullName) {
        Resume resume4 = new Resume(uuid, fullName);
        resume4.setContact(ContactType.PHONE, "784-10-08");

        resume4.setSection(SectionType.OBJECTIVE, new TextSection("Мастер маникюра"));
        resume4.setSection(SectionType.PERSONAL, new TextSection("Выдержка, умение находить оригинальные идеи"));
        resume4.setSection(SectionType.ACHIEVEMENT, new ListSection(
                "Аппаратный маникюр",
                "Классически маникюр",
                "Технология стемпинг"
        ));
        resume4.setSection(SectionType.QUALIFICATIONS, new ListSection(
                "МАСТЕР ПОД КЛЮЧ - г. Киев",
                "Стильные дизайны - г. Днепр"
        ));
        resume4.setSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("NOVA POSHTA", "novaposhta.ua",
                                new Organization.Position(2012, Month.JUNE,
                                        "Operator",
                                        "Solving of customer problems"
                                )
                        )
                )
        );
        resume4.setSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Новосибирская Академия Красоты", "http://NBA.ru/",
                                new Organization.Position(2008, Month.AUGUST, 2011, Month.JULY,
                                        "Стилист - визажист", ""
                                )
                        )
                )
        );
        return resume4;
    }
}

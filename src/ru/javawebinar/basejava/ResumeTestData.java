package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.*;

import java.time.LocalDate;

public class ResumeTestData {
    public static void main(String[] args) {
        Resume resume = new Resume("Григорий Кислин");

        // Contacts initialization
        resume.addContact(ContactType.PHONE, "+7(921) 855-0482");
        resume.addContact(ContactType.SKYPE, "grigory.kislin");
        resume.addContact(ContactType.MAIL, "gkislin@yandex.ru");
        resume.addContact(ContactType.LINKEDIN, "gkislin");
        resume.addContact(ContactType.GITHUB, "gkislin");
        resume.addContact(ContactType.STACKOVERFLOW, "gkislin");
        resume.addContact(ContactType.HOME_PAGE, "Домашняя страница");

        // Objective initialization
        resume.addSection(SectionType.OBJECTIVE,
                new TextSection("Ведущий стажировок и корпоративного обучения по Java Web и Enterprise " +
                        "технологиям"));

        // Personal initialization
        resume.addSection(SectionType.PERSONAL,
                new TextSection("Аналитический склад ума, сильная логика, креативность, инициативность. " +
                        "Пурист кода и архитектуры."));

        // Achievement initialization
        resume.addSection(SectionType.ACHIEVEMENT, new ListSection(
                "С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\"," +
                        " \"Многомодульный maven.\nМногопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). " +
                        "Удаленное взаимодействие (JMS/AKKA)\".\nОрганизация онлайн стажировок и ведение проектов. " +
                        "Более 1000 выпускников." +
                        "\n\nРеализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. " +
                        "Интеграция с Twilio,\nDuoSecurity, Google Authenticator, Jira, Zendesk." +
                        "\n\nНалаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, " +
                        "Bonita BPM,\nCMIS, LDAP. Разработка приложения управления окружением на стеке: " +
                        "Scala/Play/Anorm/JQuery. Разработка SSO\nаутентификации и авторизации различных ERP модулей," +
                        " интеграция CIFS/SMB java сервера." +
                        "\n\nРеализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, " +
                        "GWT, ExtGWT\n(GXT), Commet, HTML5, Highstock для алгоритмического трейдинга." +
                        "\n\nСоздание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base " +
                        "архитектура,\nJAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии " +
                        "через систему мониторинга Nagios.\nРеализация онлайн клиента для администрирования и " +
                        "мониторинга системы по JMX (Jython/ Django)." +
                        "\n\nРеализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, " +
                        "Chronopay,\nСбербанк), Белоруcсии(Erip, Osmp) и Никарагуа."
        ));

        // Qualification initialization
        resume.addSection(SectionType.QUALIFICATIONS, new ListSection(
                "JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2" +
                        "\n\nVersion control: Subversion, Git, Mercury, ClearCase, Perforce" +
                        "\n\nDB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle" +
                        "\n\nMySQL, SQLite, MS SQL, HSQLDB" +
                        "\n\nLanguages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy" +
                        "\n\nXML/XSD/XSLT, SQL, C/C++, Unix shell scripts" +
                        "\n\nJava Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security," +
                        " Data, Clouds, Boot), JPA\n(Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), " +
                        "Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit,\nSelenium (htmlelements)" +
                        "\n\nPython: Django" +
                        "\n\nJavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js" +
                        "\n\nScala: SBT, Play2, Specs2, Anorm, Spray, Akka" +
                        "\n\nТехнологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, " +
                        "MDB, JMX,\nJDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, " +
                        "OAuth1, OAuth2, JWT" +
                        "\n\nИнструменты: Maven + plugin development, Gradle, настройка Ngnix" +
                        "\n\nАдминистрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, " +
                        "OpenCmis, Bonita,\npgBouncer." +
                        "\n\nОтличное знание и опыт применения концепций ООП, SOA, шаблонов" +
                        " проектрирования, архитектурных шаблонов, UML,\nфункционального программирования" +
                        "\n\nРодной русский, английский \"upper intermediate\""
        ));

        // Experience initialization
        resume.addSection(SectionType.EXPERIENCE,
                new OrganizationSection(
                        new Organization("Java Online Projects", " http://javaops.ru",
                                LocalDate.of(2013, 10, 1), LocalDate.now(), "Автор проекта.",
                                "Создание, организация и проведение Java онлайн проектов и стажировок."
                        ),
                        new Organization("Wrike", " https://www.wrike.com",
                                LocalDate.of(2014, 10, 1),
                                LocalDate.of(2016, 1, 1),
                                "Старший разработчик (backend).",
                                "Проектирование и разработка онлайн платформы управления проектами Wrike " +
                                        "(Java 8 API, Maven, Spring,\n   MyBatis, Guava, Vaadin, PostgreSQL, Redis). " +
                                        "Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO."
                        ),
                        new Organization("RIT Center", null, LocalDate.of(2012, 4, 1),
                                LocalDate.of(2014, 10, 1),
                                "Java архитектор", "Организация процесса разработки системы ERP для " +
                                "разных окружений: релизная политика, версионирование,\n   ведение CI (Jenkins), " +
                                "миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), " +
                                "\n   AAA via SSO. Архитектура БД и серверной части системы. Разработка интергационных " +
                                "сервисов: CMIS,\n   BPMN2, 1C (WebServices), сервисов общего назначения (почта, " +
                                "экспорт в pdf, doc, html). Интеграция Alfresco\n   JLAN для online редактирование из " +
                                "браузера документов MS Office. Maven + plugin development, Ant, Apache\n   Commons, " +
                                "Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python " +
                                "scripting, Unix shell\n   remote scripting via ssh tunnels, PL/Python"
                        ),
                        new Organization("Luxoft (Deutsche Bank)", " http://www.luxoft.ru/",
                                LocalDate.of(2010, 12, 1),
                                LocalDate.of(2012, 4, 1),
                                "Ведущий программист", "Участие в проекте Deutsche Bank CRM (WebLogic, " +
                                "Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper,\n   Oracle). Реализация " +
                                "клиентской и серверной части CRM. Реализация RIA-приложения для\n   администрирования, " +
                                "мониторинга и анализа результатов в области алгоритмического трейдинга. JPA, " +
                                "Spring,\n   Spring-MVC, GWT, ExtGWT (GXT), Highstock, Commet, HTML5."
                        ),
                        new Organization("Yota", " https://www.yota.ru/",
                                LocalDate.of(2008, 6, 1),
                                LocalDate.of(2010, 12, 1),
                                "Ведущий специалист", "Дизайн и имплементация Java EE фреймворка для " +
                                "отдела \"Платежные Системы\" (GlassFish v2.1, v3, OC4J,\n   EJB3, JAX-WS RI 2.1, " +
                                "Servlet 2.4, JSP, JMX, JMS, Maven2). Реализация администрирования, статистики и " +
                                "\n   мониторинга фреймворка. Разработка online JMX клиента (Python/ Jython, " +
                                "Django, ExtJS)"
                        ),
                        new Organization("Enkata", " http://enkata.com/",
                                LocalDate.of(2007, 3, 1),
                                LocalDate.of(2008, 6, 1),
                                "Разработчик ПО", "Реализация клиентской (Eclipse RCP) и серверной " +
                                "(JBoss 4.2, Hibernate 3.0, Tomcat, JMS) частей кластерного\n   J2EE приложения " +
                                "(OLAP, Data mining)."
                        ),
                        new Organization("Siemens AG", " https://www.siemens.com/ru/ru/home.html",
                                LocalDate.of(2005, 1, 1),
                                LocalDate.of(2007, 2, 1),
                                "Разработчик ПО", "Разработка информационной модели, проектирование " +
                                "интерфейсов, реализация и отладка ПО на мобильной\n   IN платформе Siemens @vantage " +
                                "(Java, Unix)."
                        ),
                        new Organization("Alcatel", " http://www.alcatel.ru/",
                                LocalDate.of(1997, 9, 1),
                                LocalDate.of(2005, 1, 1),
                                "Инженер по аппаратному и программному тестированию", "Тестирование, " +
                                "отладка, внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM)."
                        )
                )
        );

        // Education initialization
        resume.addSection(SectionType.EDUCATION,
                new OrganizationSection(
                        new Organization("Coursera", " https://www.coursera.org/course/progfun",
                                LocalDate.of(2013, 3, 1),
                                LocalDate.of(2013, 5, 1),
                                "",
                                "\"Functional Programming Principles in Scala\" by Martin Odersky"
                        ),
                        new Organization("Luxoft",
                                " http://www.luxoft-training.ru/training/catalog/course.html?ID=22366",
                                LocalDate.of(2011, 3, 1),
                                LocalDate.of(2011, 4, 1),
                                "",
                                "Курс \"Объектно-ориентированный анализ ИС. Концептуальное моделирование " +
                                        "на UML.\""
                        ),
                        new Organization("Siemens AG", " http://www.siemens.ru/",
                                LocalDate.of(2005, 1, 1),
                                LocalDate.of(2005, 4, 1),
                                "",
                                "3 месяца обучения мобильным IN сетям (Берлин)"
                        ),
                        new Organization("Alcatel", " http://www.alcatel.ru/",
                                LocalDate.of(1997, 9, 1),
                                LocalDate.of(1998, 3, 1),
                                "",
                                "6 месяцев обучения цифровым телефонным сетям (Москва)"
                        ),
                        new Organization("Санкт-Петербургский национальный исследовательский университет " +
                                "информационных технологий, механики и оптики", " http://www.ifmo.ru/",
                                LocalDate.of(1993, 9, 1),
                                LocalDate.of(1996, 7, 1),
                                "",
                                "Аспирантура (программист С, С++)"
                        ),
                        new Organization("", null, LocalDate.of(1987, 9, 1),
                                LocalDate.of(1993, 7, 1),
                                "",
                                "Инженер (программист Fortran, C)"
                        ),
                        new Organization("Заочная физико-техническая школа при МФТИ",
                                " http://www.school.mipt.ru/",
                                LocalDate.of(1984, 9, 1),
                                LocalDate.of(1987, 6, 1),
                                "",
                                "Закончил с отличием"
                        )
                )
        );

        //Result
        System.out.println(resume);
    }
}

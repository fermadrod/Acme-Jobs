
    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `audit_record` 
       drop 
       foreign key `FKdcrrgv6rkfw2ruvdja56un4ji`;

    alter table `audit_record` 
       drop 
       foreign key `FKlbvbyimxf6pxvbhkdd4vfhlnd`;

    alter table `auditor` 
       drop 
       foreign key FK_clqcq9lyspxdxcp6o4f3vkelj;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `customization_parameters_spam_words` 
       drop 
       foreign key `FKhcqquyqtys40tece78apjsbyt`;

    alter table `employer` 
       drop 
       foreign key FK_na4dfobmeuxkwf6p75abmb2tr;

    alter table `job` 
       drop 
       foreign key `FK3rxjf8uh6fh2u990pe8i2at0e`;

    alter table `message` 
       drop 
       foreign key `FKik4epe9dp5q6uenarfyia7xin`;

    alter table `message_thread_message` 
       drop 
       foreign key `FKka0a2jm3m6obl7wa6586cqyp4`;

    alter table `message_thread_message` 
       drop 
       foreign key `FKp1bkunf5gyu1vtt1q3f2djagy`;

    alter table `message_tags` 
       drop 
       foreign key `FKk6j00y1eiyu6qe5gad8rvefed`;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    alter table `user_involved` 
       drop 
       foreign key `FKevpise8r0ofnf4xpw18mkgesw`;

    alter table `user_involved` 
       drop 
       foreign key `FKn5kf90daeyb1rcq0soeax5tx3`;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `audit_record`;

    drop table if exists `auditor`;

    drop table if exists `authenticated`;

    drop table if exists `challenge`;

    drop table if exists `commercial_banner`;

    drop table if exists `consumer`;

    drop table if exists `customization_parameters`;

    drop table if exists `customization_parameters_spam_words`;

    drop table if exists `employer`;

    drop table if exists `investor_record`;

    drop table if exists `job`;

    drop table if exists `message`;

    drop table if exists `message_thread`;

    drop table if exists `message_thread_message`;

    drop table if exists `message_tags`;

    drop table if exists `non_commercial_banner`;

    drop table if exists `offer`;

    drop table if exists `provider`;

    drop table if exists `records`;

    drop table if exists `request`;

    drop table if exists `user_account`;

    drop table if exists `user_involved`;

    drop table if exists `hibernate_sequence`;

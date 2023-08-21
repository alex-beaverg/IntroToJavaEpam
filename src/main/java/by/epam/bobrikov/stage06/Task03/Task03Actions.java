package by.epam.bobrikov.stage06.Task03;

import by.epam.bobrikov.stage06.Task03.Server.ArchiveServer;

/**
 * Попробуйте решить данную задачу хотя бы на 50%.
 * Создайте клиент-серверное приложение “Архив”.
 * Общие требования к заданию:
 * • В архиве хранятся Дела (например, студентов). Архив находится на сервере.
 * • Клиент, в зависимости от прав, может запросить дело на просмотр, внести в него изменения, или создать новое дело.
 * Требования к коду лабораторной работы:
 * • Для реализации сетевого соединения используйте сокеты.
 * • Формат хранения данных на сервере – xml-файлы
 */
public class Task03Actions {
    public void taskCalculation(){
        ArchiveServer.run();
        // TODO: The Client must be running in its own terminal [IDE -> Run 'Client.main()']
    }
}

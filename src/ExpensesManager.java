public class ExpensesManager {
    double[] expenses =  new double [7];

    double ExpensesManager() {
         double saveExpense(Scanner scanner, double moneyBeforeSalary) {

            // печать вопросов и считывание ответов оставьте в классе Practicum
            System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
            int day = scanner.nextInt();
            System.out.println("Введите размер траты:");
            double expense = scanner.nextDouble();

            moneyBeforeSalary = moneyBeforeSalary - expense;
            expenses[day - 1] = expenses[day - 1] + expense;
            System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
            if (moneyBeforeSalary < 1000) {
                System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
            }
            return moneyBeforeSalary;
        }

        void printAllExpenses() {
            for (int i = 0; i < expenses.length; i++) {
                System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
            }
        }

        double findMaxExpense() {
            double maxExpense = 0;
            for (int i = 0; i < expenses.length; i++) {
                if (expenses[i] > maxExpense) {
                    maxExpense = expenses[i];
                }
            }
            return maxExpense;
        }

    }

}
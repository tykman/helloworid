public class Main {
    public  static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 7637898;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        System.out.println(firstBoxer);
        var secondBoxer = 82.7;
        System.out.println(secondBoxer);
        var totalWeight = (firstBoxer + secondBoxer);
        System.out.println(totalWeight);
        var differenceWeight = (firstBoxer - secondBoxer);
        System.out.println(differenceWeight);

        var weightDiff = (secondBoxer - firstBoxer);
        System.out.println(weightDiff);
        var remainderOf = (secondBoxer % firstBoxer);
        System.out.println(remainderOf);

        var hoursOf = 640;
        var oneStaff = 8;
        var companyEmpl = (hoursOf / oneStaff);
        System.out.println("Всего работников в компании" + companyEmpl + "человек");

        var oneStaff1 = 80;
        var oneStaff2 = 94;
        var compEmp = (oneStaff1 + oneStaff2);
        System.out.println(compEmp);

        var comEmpl = 174;
        var hoursOf1 = 8;
        var oneStaff3 = (comEmpl * hoursOf1);
        System.out.println("Если в компании работает" + comEmpl + "человек,то всего" + oneStaff3 + "часов работы может быть поделено между сотрудниками");
    }
}
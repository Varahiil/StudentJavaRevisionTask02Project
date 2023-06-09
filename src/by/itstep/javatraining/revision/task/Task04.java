package by.itstep.javatraining.revision.task;

/*	Task 04. Rectangular World (2) [прямоугольный мир]
 *
 *	В прямоугольном мире есть свинья, раскормленная до размеров параллелепипеда.
 *	Определите, может ли основание свиньи полностью поместиться в прямоугольную лужу грязи,
 *	заданную сторонами А и B.
 *
 *	Примечание
 *	Не забудьте использовать "защиту от дурака", т.к. все величины должны быть больше нуля.
 *	В случае неверных данных необходимо возвратить значение false.
 *
 *	Формат входных данных [input]
 *	Функция получает на вход четыре целых натуральных числа W (width), L (length), A и B:
 *	ширину и длину прямоугольной свиньи и стороны прямоугольной лужи.
 *
 *	Формат выходных данных [output]
 *	Функция должна возвратить значение булевского типа.
 *
 *	[ input 1]: 4 6 5 5
 *	[output 1]: false
 *
 *	[ input 2]: 3 5 5 4
 *	[output 2]: true
 *
 *	[ input 3]: 0 5 5 4
 *	[output 3]: false
 *
 *	[ input 4]: 3 5 -5 4
 *	[output 4]: false
 */

public class Task04 {
    public static boolean task04(int width, int length, int a, int b) {
//        boolean answer = false;
//        int maxSide = Math.max(a, b);
//        int minxSide = Math.min(a, b);
//        if (width > 0 && length > 0 && a > 0 && b > 0) {
//            if (width <= minxSide && length <= maxSide || width <= maxSide && length <= minxSide) {
//                answer = true;
//            }
        boolean answer = true;
        if (width <= 0 || length <= 0 || a <= 0 || b <= 0) {
            answer = false;
        } else if (width >= length) {
            if (a >= b) {
                if (a < width || b < length) {
                    answer = false;
                }
            } else if (b < width || a < length) {
                answer = false;
            }
        } else if (a >= b) {
            if (a < length || b < width) {
                answer = false;
            }
        } else {
            if (b < length || a < width) {
                answer = false;
            }
        }
        return answer;
    }
}

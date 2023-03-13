import java.util.Queue;

public class Q5 {
    public static void roundRobinScheduling(List<Process> processes, int quantum) {
        Queue<Process> queue = new LinkedList<>();
        int time = 0;
        for (Process process : processes) {
            queue.add(process);
        }
        while (!queue.isEmpty()) {
            Process currentProcess = queue.remove();
            int remainingTime = currentProcess.getTime() - quantum;
            if (remainingTime > 0) {
                currentProcess.setTime(remainingTime);
                queue.add(currentProcess);
                time += quantum;
            } else {
                time += currentProcess.getTime();
                System.out.println("Process " + currentProcess.getName() + " finished at time " + time);
            }

}

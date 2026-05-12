public class AlertVisitor implements MetricVisitor {

    @Override
    public void visit(CpuMetric cpu) {
        if(cpu.load > 70) {
            System.out.println("incarcare CPU critica: " + cpu.load + "%");
        }
    }
}

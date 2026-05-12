public class CpuMetric implements MetricElement {
    public int load = 75;

    @Override
    public void accept(MetricVisitor visitor) {
        visitor.visit(this);
    }
}

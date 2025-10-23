package d6;

import W5.AbstractC0117y;
/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f9315s;

    public i(Runnable runnable, long j7, B4.b bVar) {
        super(j7, bVar);
        this.f9315s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9315s.run();
        } finally {
            this.f9314r.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f9315s;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0117y.j(runnable));
        sb.append(", ");
        sb.append(this.f9313q);
        sb.append(", ");
        sb.append(this.f9314r);
        sb.append(']');
        return sb.toString();
    }
}

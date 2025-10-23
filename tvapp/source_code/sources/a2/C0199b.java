package a2;
/* renamed from: a2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199b {

    /* renamed from: a  reason: collision with root package name */
    public final long f4986a;

    /* renamed from: b  reason: collision with root package name */
    public final T1.i f4987b;

    /* renamed from: c  reason: collision with root package name */
    public final T1.h f4988c;

    public C0199b(long j7, T1.i iVar, T1.h hVar) {
        this.f4986a = j7;
        if (iVar != null) {
            this.f4987b = iVar;
            this.f4988c = hVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0199b)) {
            return false;
        }
        C0199b c0199b = (C0199b) obj;
        if (this.f4986a == c0199b.f4986a && this.f4987b.equals(c0199b.f4987b) && this.f4988c.equals(c0199b.f4988c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f4986a;
        return ((((((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003) ^ this.f4987b.hashCode()) * 1000003) ^ this.f4988c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4986a + ", transportContext=" + this.f4987b + ", event=" + this.f4988c + "}";
    }
}

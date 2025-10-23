package J4;
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f1424a;

    public a(int i7) {
        this.f1424a = i7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        a aVar = (a) ((d) obj);
        if (this.f1424a == aVar.f1424a) {
            Object obj2 = c.f1426q;
            aVar.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f1424a) + (c.f1426q.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f1424a + "intEncoding=" + c.f1426q + ')';
    }
}

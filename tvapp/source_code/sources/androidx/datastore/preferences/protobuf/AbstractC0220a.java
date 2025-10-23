package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0220a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(InterfaceC0223b0 interfaceC0223b0) {
        AbstractC0243w abstractC0243w = (AbstractC0243w) this;
        int i7 = abstractC0243w.memoizedSerializedSize;
        if (i7 == -1) {
            int d = interfaceC0223b0.d(this);
            abstractC0243w.memoizedSerializedSize = d;
            return d;
        }
        return i7;
    }

    public abstract void c(C0232k c0232k);
}

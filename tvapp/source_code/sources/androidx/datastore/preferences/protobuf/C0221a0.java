package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221a0 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0220a f5739a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5740b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5741c;
    public final int d;

    public C0221a0(AbstractC0243w abstractC0243w, String str, Object[] objArr) {
        char charAt;
        this.f5739a = abstractC0243w;
        this.f5740b = str;
        this.f5741c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i7 = charAt2 & 8191;
            int i8 = 1;
            int i9 = 13;
            while (true) {
                int i10 = i8 + 1;
                charAt = str.charAt(i8);
                if (charAt < 55296) {
                    break;
                }
                i7 |= (charAt & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
            charAt2 = i7 | (charAt << i9);
        }
        this.d = charAt2;
    }

    public final AbstractC0220a a() {
        return this.f5739a;
    }

    public final Object[] b() {
        return this.f5741c;
    }

    public final String c() {
        return this.f5740b;
    }

    public final int d() {
        if ((this.d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}

package O3;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2598a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2599b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2600c;

    public F(Object obj, Object obj2, Object obj3) {
        this.f2598a = obj;
        this.f2599b = obj2;
        this.f2600c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2598a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f2599b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f2600c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}

package c3;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7255a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7256b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7257c;

    public a(String str, boolean z7) {
        this.f7257c = str;
        this.f7256b = z7;
    }

    public String toString() {
        switch (this.f7255a) {
            case 0:
                String str = this.f7257c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f7256b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public a(boolean z7, String str) {
        this.f7256b = z7;
        this.f7257c = str;
    }
}

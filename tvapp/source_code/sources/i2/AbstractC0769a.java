package i2;
/* renamed from: i2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0769a {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11330q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f11331r;

    public /* synthetic */ AbstractC0769a() {
    }

    public static String c(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int e(int i7) {
        return (i7 >> 24) & 255;
    }

    public void b(int i7) {
        this.f11331r = i7 | this.f11331r;
    }

    public boolean d(int i7) {
        if ((this.f11331r & i7) == i7) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f11330q) {
            case 1:
                return c(this.f11331r);
            default:
                return super.toString();
        }
    }

    public AbstractC0769a(int i7) {
        this.f11331r = i7;
    }
}

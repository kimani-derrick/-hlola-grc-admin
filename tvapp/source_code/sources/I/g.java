package I;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1199a = new Object();

    public final int a(int i7, CharSequence charSequence) {
        int i8 = 2;
        for (int i9 = 0; i9 < i7 && i8 == 2; i9++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i9));
            h hVar = i.f1202a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i8 = 2;
                            break;
                    }
                }
                i8 = 0;
            }
            i8 = 1;
        }
        return i8;
    }
}

package k2;

import Z2.H;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x2.C1461c;
import x2.InterfaceC1460b;
/* renamed from: k2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952q {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f12188c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f12189a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f12190b = -1;

    public final boolean a(String str) {
        Matcher matcher = f12188c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i7 = H.f4603a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f12189a = parseInt;
                    this.f12190b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(C1461c c1461c) {
        int i7 = 0;
        while (true) {
            InterfaceC1460b[] interfaceC1460bArr = c1461c.f16206q;
            if (i7 < interfaceC1460bArr.length) {
                InterfaceC1460b interfaceC1460b = interfaceC1460bArr[i7];
                if (interfaceC1460b instanceof C2.e) {
                    C2.e eVar = (C2.e) interfaceC1460b;
                    if ("iTunSMPB".equals(eVar.f394s) && a(eVar.f395t)) {
                        return;
                    }
                } else if (interfaceC1460b instanceof C2.k) {
                    C2.k kVar = (C2.k) interfaceC1460b;
                    if ("com.apple.iTunes".equals(kVar.f406r) && "iTunSMPB".equals(kVar.f407s) && a(kVar.f408t)) {
                        return;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                return;
            }
        }
    }
}

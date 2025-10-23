package f2;

import Z2.InterfaceC0158c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import e2.K;
import j2.n;
import j2.p;
import java.lang.reflect.Constructor;
import java.util.concurrent.ScheduledExecutorService;
import k2.InterfaceC0946k;
import o4.InterfaceC1071c;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Z2.m, InterfaceC0158c, p, InterfaceC1071c, M4.a, C2.g {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10344q;

    public /* synthetic */ d(int i7) {
        this.f10344q = i7;
    }

    @Override // j2.p
    public void a() {
    }

    @Override // Z2.InterfaceC0158c
    public void b(Object obj) {
        ((n) obj).a();
    }

    @Override // Z2.m
    public void c(Object obj) {
        k kVar = (k) obj;
        switch (this.f10344q) {
            case 0:
                kVar.getClass();
                return;
            case 1:
                kVar.getClass();
                return;
            case 2:
                kVar.getClass();
                return;
            case 3:
                kVar.getClass();
                return;
            case 4:
                kVar.getClass();
                return;
            case 5:
                kVar.getClass();
                return;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                kVar.getClass();
                return;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                kVar.getClass();
                return;
            case 8:
                kVar.getClass();
                return;
            case 9:
                kVar.getClass();
                return;
            case 10:
                kVar.getClass();
                return;
            case 11:
                kVar.getClass();
                return;
            case 12:
                kVar.getClass();
                return;
            case 13:
                kVar.getClass();
                return;
            default:
                kVar.getClass();
                return;
        }
    }

    @Override // C2.g
    public boolean d(int i7, int i8, int i9, int i10, int i11) {
        return (i8 == 67 && i9 == 79 && i10 == 77 && (i11 == 77 || i7 == 2)) || (i8 == 77 && i9 == 76 && i10 == 76 && (i11 == 84 || i7 == 2));
    }

    public String e(Context context) {
        int i7;
        switch (this.f10344q) {
            case 15:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo != null) {
                    return String.valueOf(applicationInfo.targetSdkVersion);
                }
                return "";
            case 16:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                    i7 = applicationInfo2.minSdkVersion;
                    return String.valueOf(i7);
                }
                return "";
            case 17:
                int i8 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                if (i8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    return "embedded";
                }
                return "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName != null) {
                    return FirebaseCommonRegistrar.a(installerPackageName);
                }
                return "";
        }
    }

    @Override // M4.a
    public void f(M4.b bVar) {
    }

    public Constructor g() {
        switch (this.f10344q) {
            case 22:
                if (!Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC0946k.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC0946k.class).getConstructor(null);
        }
    }

    @Override // o4.InterfaceC1071c
    public Object h(H.e eVar) {
        switch (this.f10344q) {
            case 21:
                return AbtRegistrar.a(eVar);
            case 22:
            case 23:
            case 24:
            default:
                o4.k kVar = ExecutorsRegistrar.f9169a;
                return p4.k.f13168q;
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9169a.get();
            case 26:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9171c.get();
            case 27:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9170b.get();
        }
    }

    public /* synthetic */ d(C0695a c0695a) {
        this.f10344q = 0;
    }

    public /* synthetic */ d(C0695a c0695a, int i7) {
        this.f10344q = 5;
    }

    public /* synthetic */ d(C0695a c0695a, K k5, i2.i iVar) {
        this.f10344q = 14;
    }

    public /* synthetic */ d(C0695a c0695a, Exception exc, int i7) {
        this.f10344q = i7;
    }

    public /* synthetic */ d(C0695a c0695a, boolean z7) {
        this.f10344q = 1;
    }
}

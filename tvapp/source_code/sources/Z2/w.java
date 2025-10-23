package Z2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.measurement.Y3;
import g2.C0716g;
import g2.C0720k;
import java.util.concurrent.Executor;
import s3.AbstractC1203v;
import s3.C1154I;
import s3.C1169d0;
import s3.C1175g0;
/* loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4683a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4684b;

    public /* synthetic */ w(int i7, Object obj) {
        this.f4683a = i7;
        this.f4684b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        C1154I c1154i;
        String str;
        switch (this.f4683a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i7 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i7 = type != 9 ? 8 : 7;
                                        }
                                        i7 = 5;
                                    }
                                }
                                i7 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i7 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i7 = 4;
                                    break;
                                case 13:
                                    i7 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i7 = 6;
                                    break;
                                case 18:
                                    i7 = 2;
                                    break;
                                case 20:
                                    if (H.f4603a >= 29) {
                                        i7 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i7 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i8 = H.f4603a;
                x xVar = (x) this.f4684b;
                if (i8 >= 31 && i7 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        v vVar = new v(xVar);
                        mainExecutor = context.getMainExecutor();
                        telephonyManager.registerTelephonyCallback(mainExecutor, vVar);
                        telephonyManager.unregisterTelephonyCallback(vVar);
                        return;
                    } catch (RuntimeException unused2) {
                        x.a(xVar, 5);
                        return;
                    }
                }
                x.a(xVar, i7);
                return;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    C0720k.a((C0720k) this.f4684b, C0716g.c(context, intent));
                    return;
                }
                return;
            default:
                C1175g0 c1175g0 = (C1175g0) this.f4684b;
                if (intent == null) {
                    c1154i = c1175g0.f14064y;
                    C1175g0.i(c1154i);
                    str = "App receiver called with null intent";
                } else {
                    String action = intent.getAction();
                    if (action == null) {
                        c1154i = c1175g0.f14064y;
                        C1175g0.i(c1154i);
                        str = "App receiver called with null action";
                    } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        c1154i = c1175g0.f14064y;
                        C1175g0.i(c1154i);
                        str = "App receiver called with unknown action";
                    } else {
                        Y3.a();
                        if (c1175g0.f14062w.O(null, AbstractC1203v.f14265C0)) {
                            C1154I c1154i2 = c1175g0.f14064y;
                            C1175g0.i(c1154i2);
                            c1154i2.f13803D.d("App receiver notified triggers are available");
                            C1169d0 c1169d0 = c1175g0.f14065z;
                            C1175g0.i(c1169d0);
                            P.b bVar = new P.b(18);
                            bVar.f2739r = c1175g0;
                            c1169d0.M(bVar);
                            return;
                        }
                        return;
                    }
                }
                c1154i.f13810y.d(str);
                return;
        }
    }

    public w(C1175g0 c1175g0) {
        this.f4683a = 2;
        this.f4684b = c1175g0;
    }
}

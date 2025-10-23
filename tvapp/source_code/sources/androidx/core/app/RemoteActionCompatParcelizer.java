package androidx.core.app;

import I0.a;
import I0.b;
import I0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f5610a;
        boolean z7 = true;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        remoteActionCompat.f5610a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f5611b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1208e);
        }
        remoteActionCompat.f5611b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f5612c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f1208e);
        }
        remoteActionCompat.f5612c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.g(remoteActionCompat.d, 4);
        boolean z8 = remoteActionCompat.f5613e;
        if (aVar.e(5)) {
            if (((b) aVar).f1208e.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        remoteActionCompat.f5613e = z8;
        boolean z9 = remoteActionCompat.f;
        if (aVar.e(6)) {
            if (((b) aVar).f1208e.readInt() == 0) {
                z7 = false;
            }
            z9 = z7;
        }
        remoteActionCompat.f = z9;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f5610a;
        aVar.i(1);
        aVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f5611b;
        aVar.i(2);
        Parcel parcel = ((b) aVar).f1208e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f5612c;
        aVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        aVar.k(remoteActionCompat.d, 4);
        boolean z7 = remoteActionCompat.f5613e;
        aVar.i(5);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = remoteActionCompat.f;
        aVar.i(6);
        parcel.writeInt(z8 ? 1 : 0);
    }
}

package k;

import K.C0029e;
import K.InterfaceC0028d;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
/* renamed from: k.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0918v {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0028d interfaceC0028d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0028d = new T4.c(clipData, 3);
            } else {
                C0029e c0029e = new C0029e();
                c0029e.f1476r = clipData;
                c0029e.f1477s = 3;
                interfaceC0028d = c0029e;
            }
            K.O.e(textView, interfaceC0028d.i());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0028d interfaceC0028d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0028d = new T4.c(clipData, 3);
        } else {
            C0029e c0029e = new C0029e();
            c0029e.f1476r = clipData;
            c0029e.f1477s = 3;
            interfaceC0028d = c0029e;
        }
        K.O.e(view, interfaceC0028d.i());
        return true;
    }
}

package personal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil{
	/**
	 * String�� ��¥�� Date������ ��ȯ�ϴ� �޼ҵ�
	 * 
	 * @param strDate ��ȯ�� ��¥
	 * @return ��¥
	 */
	public Date toDate(String strDate) {
		Date date=null;
		
		try {
			if (!isDateCheck(strDate)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
				//���� �߻��ڵ� ���α׷��� ���̱� ����
			}

			strDate = strDate.replaceAll("(\\-|\\.|/)", "");
			
			SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMdd");
			date = sformat.parse(strDate);
			
		} catch (ParseException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return date;
	}

	/**
	 * Date���� String������ ��ȯ�ϴ� �޼ҵ�
	 * 
	 * @param date ��ȯ�� ��¥
	 * @return ��ȯ�� ���ڿ�
	 */
	public String toString(Date date) {
		String str=null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        str = sdf.format(date);
		
		return str;
	}
	
	/**
	 * ���̸� ���ϴ� �޼ҵ� 
	 * @param strDate
	 * @return ����
	*/
	public int toAge(String strDate) {
		int age=0;
		try {
			if(!isDateCheck(strDate)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate); //���⼭ ������ �Ʒ��� ����
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year=Integer.parseInt(strDate.substring(0, 4));
			int month=Integer.parseInt(strDate.substring(4, 6));
			int day=Integer.parseInt(strDate.substring(6));
			
			Calendar cal= Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar now = Calendar.getInstance ();
		    
		    age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		    if ( (cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
		            || (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) 
		              && cal.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
		        age--;
		    }
		    
		} catch(IllegalArgumentException e) { //�Ʒ��� ��Ƽ� �ٽ� ����
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return age;
	}
	
	/**
	 * ���������� ���ϴ� �޼ҵ�
	 * @param strDate
	 * @return �����̸� true�� ����
	 */
	public boolean isLeapYear(String strDate) {
		boolean b=false;
		
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year=Integer.parseInt(strDate.substring(0, 4));
			
			b = isLeapYear(year);
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return b;
	}

	/**
	 * ���������� ���ϴ� �޼ҵ�
	 * @param year
	 * @return �����̸� true�� ����
	 */
	public boolean isLeapYear(int year) {
		return year%4==0&&year%100!=0||year%400==0;
	}
	
	/**
	 * �� ��¥ ������ ����(����)�� ���ϴ� �޼ҵ�
	 * @param startDate
	 * @param endDate
	 * @return ��¥ ����(����)
	 */
	public int toDiffDays(String startDate, String endDate) {
		int dif=0;
		
		try {
			if((startDate.length() != 8 && startDate.length()!=10) ||
				(endDate.length() != 8 && endDate.length()!=10)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
			}
			
			if(startDate.length()==10) {
				startDate= startDate.replaceAll("\\-|\\.|/","");
			}
			if(endDate.length()==10) {
				endDate= endDate.replaceAll("\\-|\\.|/","");
			}
			
			SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMdd");
            Date begin = sformat.parse(startDate);
    		Date end = sformat.parse(endDate);
    		dif= (int)((end.getTime() - begin.getTime()) / (24 * 60 * 60* 1000));
    		
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd)");
		}

		return dif;
	}
	
	/**
	 * ���س�¥�� ��ĥ° �Ǵ� ���� ���ϴ� �޼ҵ�
	 * @param strDate ���س�¥
	 * @param days ��ĥ° �Ǵ� ���� ����� ����
	 * @return ��ĥ���� ��¥(yyyyMMdd)
	 */
	public String toDaysLater(String strDate, int days) {
		String result = "";
		try {
			if((strDate.length() != 8 && strDate.length() != 10)) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length()==10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}

			int year = Integer.parseInt(strDate.substring(0,4));
			int month = Integer.parseInt(strDate.substring(4,6));
			int day = Integer.parseInt(strDate.substring(6,8));
			
			Calendar cal = Calendar.getInstance();
			cal.set(year, month-1, day);
			cal.add(Calendar.DATE, days);
			
			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH)+1;
			day = cal.get(Calendar.DATE);
			
			result = String.format("%4d%02d%02d", year, month, day) ;
    		
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): "+strDate);
		}
		
		return result;
	}
	
	/**
	 * �� ���� ������(�Ͽ���)�� ���ϴ� �޼ҵ�
	 * @param strDate
	 * @return �� ���� ��������(yyyyMMdd)
	 */
	public String toWeekStart(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			int month = Integer.parseInt(strDate.substring(4, 6));
			int day = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar sday = (Calendar)cal.clone();
			int t = cal.get(Calendar.DAY_OF_WEEK) - 1;
			sday.add(Calendar.DAY_OF_MONTH, t*-1);
		    
			year = sday.get(Calendar.YEAR);
			month = sday.get(Calendar.MONTH)+1;
			day = sday.get(Calendar.DATE);
			
			s = String.format("%4d%02d%02d", year, month, day) ;
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
	}
	
	/**
	 * �� ���� ��������(�����)�� ���ϴ� �޼ҵ�
	 * @param strDate
	 * @return �� ���� ����������(yyyyMMdd)
	 */
	public String toWeekEnd(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			int month = Integer.parseInt(strDate.substring(4, 6));
			int day = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance ();
		    cal.set(Calendar.YEAR, year);
		    cal.set(Calendar.MONTH, month-1);
		    cal.set(Calendar.DATE, day);
		    
		    Calendar eday = (Calendar)cal.clone();
			int t = 7 - cal.get(Calendar.DAY_OF_WEEK);
			eday.add(Calendar.DAY_OF_MONTH, t);
		    
			year = eday.get(Calendar.YEAR);
			month = eday.get(Calendar.MONTH)+1;
			day = eday.get(Calendar.DATE);
			
			s = String.format("%4d%02d%02d", year, month, day) ;
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
	}
	
	/**
	 * Ư����¥�� ������¥�� ���ϴ� �޼ҵ�
	 * @param strDate ������¥�� ���� ��¥
	 * @return Ư����¥�� ������¥ ���� (yyyyMMdd)
	 */
    public String afterDays(String strDate) {
        String date = "";
        
        try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
	        
	        Calendar cal = Calendar.getInstance();
	        cal.set(Integer.parseInt(strDate.substring(0,4)), Integer.parseInt(strDate.substring(4,6))-1, Integer.parseInt(strDate.substring(6,8)));

	        cal.add(Calendar.DATE, +1);

	        SimpleDateFormat formatter = new SimpleDateFormat ("yyyyMMdd", Locale.KOREA);
	        date = formatter.format (cal.getTime());
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}        

         return date;
    }

    /**
     * Ư����¥�� ������¥�� ���ϴ� �޼ҵ�
     * @param strDate ������¥�� ���� ��¥
     * @return Ư����¥�� ������¥ ���� (yyyyMMdd)
     */
    public String preDays(String strDate) {
        String date = "";

		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
	        Calendar cal = Calendar.getInstance();

	        cal.set(Integer.parseInt(strDate.substring(0,4)), Integer.parseInt(strDate.substring(4,6))-1, Integer.parseInt(strDate.substring(6,8)));
	        cal.add(Calendar.DATE, -1);

	        SimpleDateFormat formatter = new SimpleDateFormat ("yyyyMMdd", Locale.KOREA );
	        date = formatter.format (cal.getTime());
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

        return date;
    }
    
    /**
     * �ش�⵵�� �츦 ���ϴ� �޼ҵ�
     * @param strDate
     * @return
     */
    public String toTti(String strDate) {
		String s="";
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
			}
			
			if(strDate.length() == 10) {
				strDate = strDate.replaceAll("\\-|\\.|/","");
			}
			
			int year = Integer.parseInt(strDate.substring(0, 4));
			s = toTti(year);
			
		} catch(IllegalArgumentException e) {
			throw e;
		} catch(Exception e) {
			throw new IllegalArgumentException("Invalid date format(yyyyMMdd, yyyy-MM-dd): " + strDate);
		}

		return s;
    }
    
    /**
     * �ش�⵵�� �츦 ���ϴ� �޼ҵ�
     * @param year
     * @return
     */
    public String toTti(int year) {
		String t[] = {"������", "��","��","����","��","��","ȣ����","�䳢","��","��","��","��"};
    	return t[year%12];
    }

	/**
	 * ��¥�� �ùٸ� ���������� �����ϴ� �޼ҵ�(�ùٸ��� true)
	 * 
	 * @param date  ������ �˾ ��¥
	 * @return      
	 */
	public boolean isDateCheck(String date) {
		try {
			if (date.length() != 8 && date.length() != 10) {
				return false;
			}

			date = date.replaceAll("(\\-|\\.|/)", "");
			int year = Integer.parseInt(date.substring(0, 4));
			int month = Integer.parseInt(date.substring(4, 6));
			int day = Integer.parseInt(date.substring(6));
			
			if(month<1||month>12)
				return false;
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month - 1);
			
			int lastDay=cal.getActualMaximum(Calendar.DATE);
			if(day<1||day>lastDay)
				return false;

		} catch (Exception e) {
			return false;
		}

		return true;
	}
	
	/**
	 * �ֹι�ȣ�� �ùٸ� ���������� �����ϴ� �޼ҵ�(�ùٸ��� true)
	 * 
	 * @param rrn  �ֹι�ȣ
	 * @return      
	 */
	public boolean isRrnCheck(String rrn) {
		int [] check = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int tot, n, lastNum, chkNum;
		boolean b=false;
		
		try {
			if (rrn.length() != 14 && rrn.length() != 13) {
				return false;
			}
			
			if(toBirth(rrn).length()==0) {
				return false;
			}

			rrn = rrn.replaceAll("-", "");

			tot=0;
			for(int i = 0; i < 12; i++) {
				n = Integer.parseInt(rrn.substring(i, i+1));

				tot = tot+(n * check[i]);
			}

			lastNum = Integer.parseInt(rrn.substring(12));
			chkNum = 11 - tot % 11;
			chkNum = chkNum % 10;
			
			b=(lastNum == chkNum);
			
		} catch (Exception e) {
			return false;
		}

		return b;
	}
	
	/**
	 * �ֹι�ȣ�� �̿��Ͽ� ��������� �����ϴ� �޼ҵ�
	 * 
	 * @param rrn  �ֹι�ȣ
	 * @return     �������
	 */
	public String toBirth(String rrn) {
		String birth="";
		int gender;
		
		try {
			if (rrn.length() != 14 && rrn.length() != 13) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
			
			rrn = rrn.replaceAll("-", "");
			gender=Integer.parseInt(rrn.substring(6,7));
			
			// birth=rrn.substring(0, 6);
			birth=rrn.substring(0, 2)+"-"+rrn.substring(2, 4)+"-"+rrn.substring(4, 6);
			if(gender==1||gender==2||gender==5||gender==6) {
				birth="19"+birth;
			} else if(gender==3||gender==4||gender==7||gender==8) {
				birth="20"+birth;
			} else if(gender==0||gender==9) {
				birth="18"+birth;
			}
			
			if(! isDateCheck(birth)) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return birth;
	}
	
	/**
	 * �ֹι�ȣ�� �̿��Ͽ� ������ �����ϴ� �޼ҵ�
	 * 
	 * @param rrn  �ֹι�ȣ
	 * @return     ����
	 */
	public String toGender(String rrn) {
		String gender="";
		int s;
		
		try {
			if (isRrnCheck(rrn)) {
				throw new IllegalArgumentException("Invalid rrn format: " + rrn);
			}
			
			rrn = rrn.replaceAll("-", "");
			s=Integer.parseInt(rrn.substring(6,7));
			
			gender="����";
			if(s%2==0)
				gender="����";
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return gender;
	}

}
